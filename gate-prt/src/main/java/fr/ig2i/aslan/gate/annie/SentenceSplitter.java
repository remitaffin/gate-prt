package fr.ig2i.aslan.gate.annie;

import gate.Factory;
import gate.FeatureMap;
import gate.ProcessingResource;
import gate.util.Out;

public class SentenceSplitter {
	static ProcessingResource regExSentenceSplitter;
	public static ProcessingResource PR(FeatureMap features) {
	    try {
	    	//Define regExSentenceSplitter Resource by calling the right plugin
	        regExSentenceSplitter = (ProcessingResource)
	                Factory.createResource("gate.creole.splitter.RegexSentenceSplitter", features);
	    } catch (Exception e) {
	        Out.prln(e);
	    }    
	    return regExSentenceSplitter;	    
	}	
}
