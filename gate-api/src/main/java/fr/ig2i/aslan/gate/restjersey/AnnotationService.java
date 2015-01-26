package fr.ig2i.aslan.gate.restjersey;

import fr.ig2i.aslan.gate.App;
import fr.ig2i.aslan.gate.InitApp;
import gate.creole.ExecutionException;
import gate.creole.ResourceInstantiationException;
import gate.persist.PersistenceException;
import gate.util.GateException;

import java.io.IOException;
import java.net.MalformedURLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.json.JSONException;

@Path("/annotationservice")
public class AnnotationService {

	@Path("inputurl")
	@GET
	@Produces("text/plain")
	public Response annotateFromInputUrl(@Context UriInfo uriInfo)
			throws JSONException, ResourceInstantiationException,
			MalformedURLException, ExecutionException, PersistenceException,
			GateException, IOException {

		String url = uriInfo.getRequestUri().toString();
		String urlSplited[] = url.split("url=");
		String texteURL = urlSplited[1];

		App.annotate(texteURL);
		String result = "Cliquer sur ce lien pour consulter le fichier XML de sortie :\n\n"
				+"mettre le lien vers le fichier output.xml sur le server";
		return Response.status(200).entity(result).build();
	}

}
