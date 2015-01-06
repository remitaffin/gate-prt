package fr.ig2i.aslan.gate.annie;

import gate.Factory;
import gate.FeatureMap;
import gate.ProcessingResource;
import gate.creole.ResourceInstantiationException;
import gate.util.Out;


public class DocumentReset{
	static ProcessingResource documentReset;
	public static ProcessingResource PR(FeatureMap features) {
	        try {
		        documentReset = (ProcessingResource)
		            Factory.createResource("gate.creole.annotdelete.AnnotationDeletePR", features);
	        }
		    catch (ResourceInstantiationException ex) {
		        Out.prln(ex);
		    }
	        return documentReset;
	}
}
