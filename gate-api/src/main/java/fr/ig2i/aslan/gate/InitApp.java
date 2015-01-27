package fr.ig2i.aslan.gate;

import gate.AnnotationSet;
import gate.Corpus;
import gate.Document;
import gate.Factory;
import gate.FeatureMap;
import gate.Gate;
import gate.corpora.DocumentStaxUtils;
import gate.creole.ResourceInstantiationException;
import gate.creole.SerialAnalyserController;
import gate.util.GateException;
import gate.util.Out;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.xml.stream.XMLStreamException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class InitApp {

	private static Logger LOGGER = Logger.getRootLogger();
	private static SerialAnalyserController annieController;
	public static Document doc = null;
	private static ServletContext context;
	private static File gateHome;

	public static void initGate() throws GateException {
		BasicConfigurator.configure();/* Set log4j.properties path */
		if (!Gate.isInitialised()) {
			gateHome = new File(context.getRealPath("/WEB-INF"));
			Gate.setGateHome(gateHome);
			try {
				Gate.init();
			} catch (GateException e1) {
				e1.printStackTrace();
			}
		}
	}

	@SuppressWarnings("deprecation")
	public static void loadAnnie() {
		LOGGER.info("\nLoading ANNIE...");
		File gateHome = Gate.getGateHome();
		File pluginsHome = new File(gateHome, "plugins");
		try {
			Gate.getCreoleRegister().registerDirectories(
					new File(pluginsHome, "ANNIE").toURL());
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (GateException ex) {
			ex.printStackTrace();
		}
	}

	public static SerialAnalyserController initAnnie()
			throws ResourceInstantiationException {
		LOGGER.info("\nInitialising ANNIE...");
		return setAnnieController((SerialAnalyserController) Factory
				.createResource("gate.creole.SerialAnalyserController",
						Factory.newFeatureMap(), Factory.newFeatureMap(),
						"ANNIE_" + Gate.genSym()));
	}

	public static SerialAnalyserController getAnnieController() {
		return annieController;
	}

	public static SerialAnalyserController setAnnieController(
			SerialAnalyserController annieController) {
		InitApp.annieController = annieController;
		return annieController;
	}

	/**
	 * Initialise le corpus
	 * 
	 * @param args
	 *            Tableau des paths des documents a inclure au corpus
	 * @return le corpus complete
	 */
	public static Corpus initCorpus(URL u) {
		Corpus corpus = null;

		FeatureMap params = Factory.newFeatureMap();
		params.put("sourceUrl", u.toString());
		params.put("markupAware", true);
		params.put("preserveOriginalContent", false);
		params.put("collectRepositioningInfo", false);
		params.put("encoding", "windows-1252");
		Out.prln("Creating doc for " + u.toString());
		try {
			corpus = Factory.newCorpus("myCorpus");
			doc = (Document) Factory.createResource(
					"gate.corpora.DocumentImpl", params);

		} catch (ResourceInstantiationException ex) {
			ex.printStackTrace();
		}
		corpus.add(doc);

		if (corpus == null)
			Out.prln("Corpus is empty");
		return corpus;
	}

	public static void printResults() {
		AnnotationSet defaultAnnotSet = doc.getAnnotations();
		Set<String> annotTypesRequired = new HashSet<String>();
		annotTypesRequired.add("Token");
		annotTypesRequired.add("Number");
		annotTypesRequired.add("Person");
		annotTypesRequired.add("Location");
		annotTypesRequired.add("Address");
		annotTypesRequired.add("Title");
		annotTypesRequired.add("Name");
		AnnotationSet token = defaultAnnotSet.get(annotTypesRequired);

		// output XML to console
		String xmlDocument = doc.toXml(token, true);
		//Out.print(xmlDocument);

		// Generate XML File
		String path = context.getRealPath("/WEB-INF/output");
		File f = new File(path + "/output.xml");
		try {
			DocumentStaxUtils.writeDocument(doc, f);
		} catch (XMLStreamException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static String getLang() {
		return doc.getFeatures().get("lang") == null ? "unknown" : doc
				.getFeatures().get("lang").toString();
	}

	/* Called by Listener */
	public static void setServletContext(ServletContext context) {
		InitApp.context = context;
	}

	/* Use this method to access context from any location */
	public static ServletContext getServletContext() {
		return InitApp.context;
	}
}
