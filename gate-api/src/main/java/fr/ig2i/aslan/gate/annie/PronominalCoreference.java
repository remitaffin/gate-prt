package fr.ig2i.aslan.gate.annie;

import gate.Factory;
import gate.FeatureMap;
import gate.ProcessingResource;
import gate.util.Out;

public class PronominalCoreference {
	static ProcessingResource pronominalCoref;
	public static ProcessingResource PR(FeatureMap features) {
		try {
		    // Defines Pronominal Coreference Resource by calling the right plugin
			features.put("resolveIt", "true");
		    pronominalCoref = (ProcessingResource)
		            Factory.createResource("gate.creole.coref.Coreferencer", features);
		} catch (Exception e) {
		    Out.prln(e);
		}
		return pronominalCoref;
	}
}
