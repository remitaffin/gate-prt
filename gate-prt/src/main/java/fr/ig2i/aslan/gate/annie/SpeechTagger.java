package fr.ig2i.aslan.gate.annie;

import gate.Factory;
import gate.FeatureMap;
import gate.ProcessingResource;
import gate.util.Out;

public class SpeechTagger{
	static ProcessingResource POSTagger;
	public static ProcessingResource PR(FeatureMap features) {
	    try {
	    	//Define POSTagger Resource by calling the right plugin
	        POSTagger = (ProcessingResource)
	                Factory.createResource("gate.creole.POSTagger", features);
	    } catch (Exception e) {
	        Out.prln(e);
	    }    
	    return POSTagger;	    
	}	
}
