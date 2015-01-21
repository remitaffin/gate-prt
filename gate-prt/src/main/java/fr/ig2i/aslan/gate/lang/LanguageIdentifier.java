package fr.ig2i.aslan.gate.lang;

import java.io.File;
import java.net.MalformedURLException;

import gate.Factory;
import gate.FeatureMap;
import gate.Gate;
import gate.ProcessingResource;
import gate.creole.ResourceInstantiationException;
import gate.util.GateException;
import gate.util.Out;


public class LanguageIdentifier{
	static ProcessingResource languageIdentifier;
	public static ProcessingResource PR(FeatureMap features) {
		 try {
		    //loading the language_identification plugin
		    Gate.getCreoleRegister().registerDirectories( 
		    	 new File(Gate.getPluginsHome(), "Language_Identification").toURL());
		} catch (MalformedURLException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		} catch (GateException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		} 
	        
		 try {
	        	// Calls the Document Reset that cleans up the document from all previous annotations  
			 languageIdentifier = (ProcessingResource) 
				 Factory.createResource("org.knallgrau.utils.textcat.LanguageIdentifier");
	        }
		    catch (ResourceInstantiationException ex) {
		        Out.prln(ex);
		    }
	        return languageIdentifier;
	}
}
