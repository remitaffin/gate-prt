package fr.ig2i.aslan.gate.annie;

import java.io.File;
import java.net.MalformedURLException;

import gate.Factory;
import gate.FeatureMap;
import gate.Gate;
import gate.ProcessingResource;
import gate.util.GateException;
import gate.util.Out;

public class Morpher {
	static ProcessingResource morpher;
	public static ProcessingResource PR(FeatureMap features) {
	    try {
	    	// Setting environment
			File gateHome = Gate.getGateHome();
			// Set plugin repo
			File pluginsHome = new File(gateHome, "plugins");
			
			try {
				// Loading all the Plugins (ANNIE, Tools, Ontology,
				// Gazetteer_Ontology_Based)
				
				
				Gate.getCreoleRegister().registerDirectories(
						new File(pluginsHome, "Tools").toURL());
				
			
				
			} catch (MalformedURLException ex) {
				ex.printStackTrace();
			} catch (GateException ex) {
				ex.printStackTrace();
			}
	    	//Define regExSentenceSplitter Resource by calling the right plugin
	        morpher = (ProcessingResource)
	                Factory.createResource("gate.creole.morph.Morph", features);
	    } catch (Exception e) {
	        Out.prln(e);
	    }    
	    return morpher;	    
	}	
}
