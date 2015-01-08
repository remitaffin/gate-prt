package fr.ig2i.aslan.gate;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import fr.ig2i.aslan.gate.annie.*;
import gate.Corpus;
import gate.CorpusController;
import gate.Document;
import gate.Factory;
import gate.FeatureMap;
import gate.Gate;
import gate.creole.ResourceInstantiationException;
import gate.creole.SerialAnalyserController;
import gate.util.GateException;
import gate.util.Out;
import gate.util.persistence.PersistenceManager;

public class App {

	private static SerialAnalyserController annieController;
	private static FeatureMap features = Factory.newFeatureMap();
	private static CorpusController cc;
	private static Corpus corpus;

	public static void main(String[] args) throws GateException, IOException {

		/* 1. Initialisze GATE library */
		InitApp.initGate();

		/* 2. Load Annie plugin */
		InitApp.loadAnnie();

		/* 3. Initialisze ANNIE */
		annieController = InitApp.initAnnie();

		/* 4 Set Corpus */
		corpus=InitApp.initCorpus(args);
		annieController.setCorpus(corpus);
		//params.clear();		
		

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

		/* 10. */

		/* 11. Alias matcher */
		features.clear();
		annieController.add(AliasMatcher.PR(features));

		/* 12. */
		/* 13. */
		/* 14. */
		/* 15. */
		/* 16. Set corpus and files */
		/* 17. Run the PR through the corpus in the ANNIE */

	}
}
