package fr.ig2i.aslan.gate.annie;

import java.io.File;
import java.net.MalformedURLException;

import gate.Factory;
import gate.FeatureMap;
import gate.Gate;
import gate.ProcessingResource;
import gate.creole.ResourceInstantiationException;
import gate.creole.ontology.Ontology;
import gate.util.GateException;

public class Gazetteer {
	private static final long serialVersionUID = 1L;
	private static Ontology ontology;

	public Gazetteer() {

		// Instantiate Processing resources variables
		ProcessingResource documentReset;
		ProcessingResource annieEnglishTokenizer;
		ProcessingResource regExSentenceSplitter;
		ProcessingResource posTagger;
		ProcessingResource morpher;
		ProcessingResource ontoRG;
		ProcessingResource flexibleGaz;
		
		// Setting environment
		File gateHome = Gate.getGateHome();
		// Set plugin repo
		File pluginsHome = new File(gateHome, "plugins");
		
		try {
			// Loading all the Plugins (ANNIE, Tools, Ontology,
			// Gazetteer_Ontology_Based)
			Gate.getCreoleRegister().registerDirectories(
					new File(pluginsHome, "ANNIE").toURL());
			
			Gate.getCreoleRegister().registerDirectories(
					new File(pluginsHome, "Tools").toURL());
			
			Gate.getCreoleRegister().registerDirectories(
					new File(pluginsHome, "Ontology").toURL());
			
			Gate.getCreoleRegister().registerDirectories(
					new File(pluginsHome, "Gazetteer_Ontology_Based").toURL());
			
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (GateException ex) {
			ex.printStackTrace();
		}

		// Create parameter for out ontology
		FeatureMap paramOntology = Factory.newFeatureMap();
		try {
			// Set the ontology parameter with our OWL path 
			paramOntology.put("rdfXmlURL",
					new File("../travel.owl").toURL());
			// Create our PR with our previous param
			ontology = (Ontology) Factory.createResource(
					"gate.creole.ontology.owlim.OWLIMOntologyLR", paramOntology);

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ResourceInstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			// Creating default parameters
			FeatureMap params = Factory.newFeatureMap();
			// Creating Processing Resources for ontoRootGazetteer
			documentReset = (ProcessingResource) Factory.createResource(
					"gate.creole.annotdelete.AnnotationDeletePR", params);

			annieEnglishTokenizer = (ProcessingResource) Factory
					.createResource("gate.creole.tokeniser.DefaultTokeniser",
							params);

			regExSentenceSplitter = (ProcessingResource) Factory
					.createResource(
							"gate.creole.splitter.RegexSentenceSplitter",
							params);

			posTagger = (ProcessingResource) Factory.createResource(
					"gate.creole.POSTagger", params);

			morpher = (ProcessingResource) Factory.createResource(
					"gate.creole.morph.Morph", params);

			// Creation of parameter for onToGaz
			FeatureMap paramsOntoGaz = Factory.newFeatureMap();
			// Setting the parameters
			paramsOntoGaz.put("ontology", ontology);
			paramsOntoGaz.put("tokeniser", annieEnglishTokenizer);
			paramsOntoGaz.put("posTagger", posTagger);
			paramsOntoGaz.put("morpher", morpher);
			// Creation of the ontoRootGazetteer PR with previous params
			ontoRG = (ProcessingResource) Factory.createResource(
					"gate.clone.ql.OntoRootGaz", paramsOntoGaz);

			// Creation of parameter for FlexibleGaz
			FeatureMap paramsFlexibleGaz = Factory.newFeatureMap();
			// Setting the parameters
			paramsFlexibleGaz.put("gazetteerInst", ontoRG);
			paramsFlexibleGaz.put("inputFeatureNames", "Token.root");
			// Creation of the flexibleGazetteer PR with previous params
			flexibleGaz = (ProcessingResource) Factory.createResource(
					"gate.creole.gazetteer.FlexibleGazetteer",
					paramsFlexibleGaz);

		} catch (ResourceInstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}