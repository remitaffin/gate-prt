package fr.ig2i.aslan.gate.annie;

import gate.Factory;
import gate.FeatureMap;
import gate.ProcessingResource;
import gate.creole.POSTagger;
import gate.creole.ResourceInstantiationException;
import gate.creole.SerialAnalyserController;

import org.apache.log4j.Logger;

public class SpeechTagger extends POSTagger {

	private static final long serialVersionUID = 1L;
	private static Logger LOGGER = Logger.getRootLogger();

	public SpeechTagger() {
		super();
	}

	public void addPR(FeatureMap features,
			SerialAnalyserController annieController)
			throws ResourceInstantiationException {
		LOGGER.info("\nAdding pos tagger Annie PR...");
		features.clear();
		ProcessingResource posTagger = (ProcessingResource) Factory
				.createResource("gate.creole.POSTagger", features);
		annieController.add(posTagger);
		LOGGER.info("\n...pos tagger Annie PR added\n");
	}
}
