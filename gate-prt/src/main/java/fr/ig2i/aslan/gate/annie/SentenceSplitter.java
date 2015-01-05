package fr.ig2i.aslan.gate.annie;

import org.apache.log4j.Logger;

import gate.Factory;
import gate.FeatureMap;
import gate.ProcessingResource;
import gate.creole.ResourceInstantiationException;
import gate.creole.SerialAnalyserController;
import gate.creole.splitter.RegexSentenceSplitter;

public class SentenceSplitter extends RegexSentenceSplitter {

	private static final long serialVersionUID = 1L;
	private static Logger LOGGER = Logger.getRootLogger();

	public SentenceSplitter() {
		super();
	}

	public void addPR(FeatureMap features,
			SerialAnalyserController annieController)
			throws ResourceInstantiationException {
		LOGGER.info("\nAdding regex sentence splitter Annie PR...");
		features.clear();
		ProcessingResource regexSentenceSplitter = (ProcessingResource) Factory
				.createResource("gate.creole.splitter.RegexSentenceSplitter",
						features);
		annieController.add(regexSentenceSplitter);
		LOGGER.info("\n...Regex sentence splitter Annie PR added\n");
	}
}
