package fr.ig2i.aslan.gate.annie;

import gate.Factory;
import gate.FeatureMap;
import gate.ProcessingResource;
import gate.util.Out;


public class Tokenizer{
	static ProcessingResource tokenizer;
	public static ProcessingResource PR(FeatureMap features) {
	    try {
	    	// Tokeniser cuts out the input text into tokens/entities
	    	tokenizer = (ProcessingResource)
	                Factory.createResource("gate.creole.tokeniser.DefaultTokeniser", features);
	    } catch (Exception e) {
	        Out.prln(e);
	    }    
	    return tokenizer;	    
	}
}
