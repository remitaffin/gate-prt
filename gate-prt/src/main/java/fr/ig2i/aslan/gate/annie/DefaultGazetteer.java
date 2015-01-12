package fr.ig2i.aslan.gate.annie;

import gate.Factory;
import gate.FeatureMap;
import gate.ProcessingResource;
import gate.util.Out;

public class DefaultGazetteer {
	static ProcessingResource AnnieGaz;
	public static ProcessingResource PR(FeatureMap features) {
	    try {
	    	AnnieGaz = (ProcessingResource)
	    			Factory.createResource("gate.creole.gazetteer.DefaultGazetteer", features);
	    } catch (Exception e) {
	        Out.prln(e);
	    }    
	    return AnnieGaz;	    
	}
}


