package fr.ig2i.aslan.gate.annie;

import gate.Factory;
import gate.FeatureMap;
import gate.ProcessingResource;
import gate.util.Out;

public class Transducer {
	static ProcessingResource transducer;
	public static ProcessingResource PR(FeatureMap features) {
	    try {
	    	String japeEntity = "resources/NE/main.jape";
	    	features.put("grammarURL", japeEntity);
	    	transducer = (ProcessingResource)
	    			Factory.createResource("gate.creole.Transducer", features);
	    } catch (Exception e) {
	        Out.prln(e);
	    }    
	    return transducer;	    
	}
	
}
