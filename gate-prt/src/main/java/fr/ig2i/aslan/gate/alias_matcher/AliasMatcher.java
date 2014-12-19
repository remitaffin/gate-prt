package fr.ig2i.aslan.gate.alias_matcher;

import gate.Factory;
import gate.FeatureMap;
import gate.ProcessingResource;
import gate.creole.ResourceInstantiationException;
import gate.creole.SerialAnalyserController;
import gate.creole.orthomatcher.OrthoMatcher;

import org.apache.log4j.Logger;

public class AliasMatcher extends OrthoMatcher {

	private static final long serialVersionUID = 1L;
	private static Logger LOGGER = Logger.getRootLogger();

	public AliasMatcher() {
		super();
	}

	public void addPR(FeatureMap features,
			SerialAnalyserController annieController)
			throws ResourceInstantiationException {
		LOGGER.info("\nAdding OrthoMatcher PR...");
		features.clear();
		ProcessingResource orthoMatcher = (ProcessingResource) Factory
				.createResource("gate.creole.orthomatcher.OrthoMatcher",
						features);
		annieController.add(orthoMatcher);
		LOGGER.info("\n...OrthoMatcher PR added\n");
	}
}
