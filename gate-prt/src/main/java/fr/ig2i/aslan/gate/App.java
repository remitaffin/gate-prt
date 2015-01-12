package fr.ig2i.aslan.gate;

import java.io.IOException;
import java.net.URL;

import fr.ig2i.aslan.gate.annie.*;
import gate.Corpus;
import gate.Factory;
import gate.FeatureMap;
import gate.creole.SerialAnalyserController;
import gate.util.GateException;


public class App {

	private static SerialAnalyserController annieController;
	private static FeatureMap features = Factory.newFeatureMap();
	private static Corpus corpus;
	public static void main(String[] args) throws GateException, IOException {

		/* 1. Initialize GATE library */
		InitApp.initGate();

		/* 2. Load Annie plugin */
		InitApp.loadAnnie();

		/* 3. Initialize ANNIE */
		annieController = InitApp.initAnnie();

		/* 4 Set Corpus */
		URL u = new URL("http://www.remitaffin.fr/aslan/article01.txt");
		corpus=InitApp.initCorpus(u);
		annieController.setCorpus(corpus);

		/* 5. Document Reset */
		features.clear();
		annieController.add(DocumentReset.PR(features));
		
		/* 6. Tokenizer */
		features.clear();
		annieController.add(Tokenizer.PR(features));
		
		/* 7. Gazetteer */
		features.clear();
		annieController.add(Gazetteer.PR());

		/* 8. Sentences splitter */
		features.clear();
		annieController.add(SentenceSplitter.PR(features));

		/* 9. Speech tagger */
		features.clear();
		annieController.add(SpeechTagger.PR(features));
		
		/* 10. Transducer */
		features.clear();
		annieController.add(Transducer.PR(features));

		/* 11. Alias matcher */
		features.clear();
		annieController.add(AliasMatcher.PR(features));
		
		/* 12. Pronominal Coreference*/
		features.clear();
		annieController.add(PronominalCoreference.PR(features));

		/* 13. Testing that all PRs have the required parameters to run */
		System.out.println("Testing PRs");
		annieController.getOffendingPocessingResources();
		
		/* 14. Executing ANNIE */
		annieController.execute();
		InitApp.printResults();
		
		/* OWL Exporter */
		//Gate.getCreoleRegister().registerDirectories(new File("C:\\Program Files\\GATE-5.1\\plugins\\OWLExporter").toURL());

	}
}
