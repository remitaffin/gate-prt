package fr.ig2i.aslan.gate.annie;

import gate.Factory;
import gate.FeatureMap;
import gate.ProcessingResource;
import gate.util.Out;


public class Tokenizer{
	static ProcessingResource tokenizer;
	public static ProcessingResource PR(FeatureMap features) {
	    try {
	    	//Define Tokenizer Resource by calling the right plugin
	    	tokenizer = (ProcessingResource)
	                Factory.createResource("gate.creole.tokeniser.SimpleTokeniser", features);
	    } catch (Exception e) {
	        Out.prln(e);
	    }    
	    return tokenizer;	    
	}
}
