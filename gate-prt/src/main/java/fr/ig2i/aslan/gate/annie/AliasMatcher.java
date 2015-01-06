package fr.ig2i.aslan.gate.annie;

import gate.Factory;
import gate.FeatureMap;
import gate.ProcessingResource;
import gate.util.Out;

public class AliasMatcher {

	static ProcessingResource aliasMatcher;
	public static ProcessingResource PR(FeatureMap features) {
	    try {
	    	//Define Alias Matcher Resource by calling the right plugin
	        aliasMatcher = (ProcessingResource)
	                Factory.createResource("gate.creole.orthomatcher.OrthoMatcher", features);
	    } catch (Exception e) {
	        Out.prln(e);
	    }    
	    return aliasMatcher;	    
	}
}
