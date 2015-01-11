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

/*
public void useCase01() throws Exception{
System.out.println("starting use case 01...");

    DataStore sds = Factory.openDataStore("gate.persist.SerialDataStore", "file:/E:/gate2/serial/debug/");
    sds.open();

    List lrIds = sds.getLrIds("gate.corpora.DocumentImpl");
    Object lrID = lrIds.get(0);

    Document doc = (Document) sds.getLr("gate.corpora.DocumentImpl", lrID);
//  Document doc = loadDocument("file:/E:/Gate2/data/gatecorpora/ace/aps/npaper/clean/9801.35.sgm");
//  Document doc = loadDocument("file:/E:/Gate2/data/gatecorpora/ace/aps/npaper/clean/9806.93.sgm");
//  Document doc = loadDocument("file:/E:/Gate2/data/gatecorpora/ace/aps/npaper/clean/9802.108.sgm");

//--    runANNIE(doc);

    Coreferencer corefMain = (Coreferencer)Factory.createResource("gate.creole.coref.Coreferencer");
    corefMain.init();
    corefMain.setDocument(doc);
System.out.println("starting COREF...");
    corefMain.execute();
System.out.println("case 01 finished...");
    return;
} */
