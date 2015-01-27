package fr.ig2i.aslan.gate.restjersey;

import java.io.File;
import java.io.FileInputStream;
import java.io.StringWriter;
import java.io.Writer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

import fr.ig2i.aslan.gate.App;
import fr.ig2i.aslan.gate.InitApp;

@Path("/annotationservice")
public class AnnotationService {

	@Path("inputurl")
	@GET
	@Produces("text/plain")
	public Response annotateFromInputUrl(@Context UriInfo uriInfo)
			throws Exception {

		String url = uriInfo.getRequestUri().toString();
		String urlSplited[] = url.split("url=");
		String texteURL = urlSplited[1];

		App.annotate(texteURL);
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setValidating(false);
		DocumentBuilder db = dbf.newDocumentBuilder();
		
		Document doc = db.parse(new FileInputStream(new File(InitApp.getServletContext().getRealPath("/WEB-INF/output/output.xml"))));
		return Response.status(200).entity(prettyPrint(doc)).build();
	}
	
	public static final String prettyPrint(Document xml) throws Exception {
		Transformer tf = TransformerFactory.newInstance().newTransformer();
		tf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		tf.setOutputProperty(OutputKeys.INDENT, "yes");
		Writer out = new StringWriter();
		tf.transform(new DOMSource(xml), new StreamResult(out));
		return out.toString();
	}

}
