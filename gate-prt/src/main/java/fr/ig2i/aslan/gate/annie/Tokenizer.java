package fr.ig2i.aslan.gate.annie;

import gate.Factory;
import gate.FeatureMap;
import gate.ProcessingResource;
import gate.util.Out;


public class Tokenizer{

	public static ProcessingResource PR(FeatureMap features) {
	    try {
		ProcessingResource tokeniser = (ProcessingResource)
	                Factory.createResource("gate.creole.tokeniser.DefaultTokeniser", features);
		return tokeniser;
	    } catch (Exception e) {
	        Out.prln(e);
	    }
	    return null;
	}
}
