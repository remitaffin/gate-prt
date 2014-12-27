package fr.ig2i.aslan.gate.document_reset;

import gate.Factory;
import gate.FeatureMap;
import gate.ProcessingResource;
import gate.creole.ResourceInstantiationException;
import gate.util.Out;


public class DocumentReset{
    
	public static ProcessingResource PR(FeatureMap features) {
	        try {
		    ProcessingResource documentReset = (ProcessingResource)
		            Factory.createResource("gate.creole.annotdelete.AnnotationDeletePR", features);
		    return documentReset;
	        }
		    catch (ResourceInstantiationException ex) {
		        Out.prln(ex);
		    }
	        return null;
	}
}
