package fr.ig2i.aslan.gate;

import gate.AnnotationSet;
import gate.Corpus;
import gate.Document;
import gate.Factory;
import gate.FeatureMap;
import gate.Gate;
import gate.creole.ResourceInstantiationException;
import gate.creole.SerialAnalyserController;
import gate.util.GateException;
import gate.util.Out;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class InitApp {

	private static Logger LOGGER = Logger.getRootLogger();
	private static SerialAnalyserController annieController;
	public static Document doc = null;

	public static void initGate() throws GateException {
		BasicConfigurator.configure();/* Set log4j.properties path */
		if (!Gate.isInitialised()) {
			LOGGER.info("\nInitialising GATE...");
			System.setProperty("gate.home", ".."); /* Set Gate Home */
			Gate.init();
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
	 * @param args   Tableau des paths des documents a inclure au corpus
	 * @return le corpus complete
	 */
	public static Corpus initCorpus(URL u)
	{
		Corpus corpus = null;
		
				FeatureMap params = Factory.newFeatureMap();
				params.put("sourceUrl", u.toString());
				params.put("markupAware", true);
				params.put("preserveOriginalContent", false);
				params.put("collectRepositioningInfo", false);
				params.put("encoding","windows-1252");
				Out.prln("Creating doc for " + u.toString());
				try {
					corpus = Factory.newCorpus("myCorpus");
					doc = (Document)
					Factory.createResource("gate.corpora.DocumentImpl", params);
					
				} catch (ResourceInstantiationException ex) {
					ex.printStackTrace();
				}
				corpus.add(doc);
		
		if(corpus == null) Out.prln("Corpus is empty");
		return corpus;
	}
	
	public static void printResults() {
		AnnotationSet defaultAnnotSet = doc.getAnnotations();
		Set<String> annotTypesRequired = new HashSet<String>();
		annotTypesRequired.add("Token");
		annotTypesRequired.add("Person");
		annotTypesRequired.add("Location");
		AnnotationSet token = defaultAnnotSet.get(annotTypesRequired);
		//System.out.println(defaultAnnotSet);
		
		//save to XML 
		String xmlDocument = doc.toXml(token, true);
		Out.print(xmlDocument);
		
	}
}
