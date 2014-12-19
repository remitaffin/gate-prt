package fr.ig2i.aslan.gate;

import fr.ig2i.aslan.gate.alias_matcher.AliasMatcher;
import fr.ig2i.aslan.gate.sentence_splitter.SentenceSplitter;
import fr.ig2i.aslan.gate.speech_tagger.SpeechTagger;
import gate.Factory;
import gate.FeatureMap;
import gate.creole.SerialAnalyserController;
import gate.util.GateException;

public class App {

	private static SerialAnalyserController annieController;
	private static FeatureMap features = Factory.newFeatureMap();

	public static void main(String[] args) throws GateException {

		/* 1. Initialisze GATE library */
		InitApp.initGate();

		/* 2. Load Annie plugin */
		InitApp.loadAnnie();

		/* 3. Initialisze ANNIE */
		annieController = InitApp.initAnnie();

		/*
		 * If you want to test each PRs, you just have to set a corpus and
		 * execute the PR In our case we will make a function to set the corpus
		 * for all PRs in step 16 
		 * Corpus corpus = ; 
		 * pr.setCorpus(corpus);
		 * pr.execute(); 
		 * ie : 
		 * sSplitter.setCorpus(corpus); 
		 * sSplitter.execute();
		 */

		/* 4. Document Reset */

		/* 6. */
		/* 7. */

		/* 8. Sentences splitter */
		SentenceSplitter sSplitter = new SentenceSplitter();
		sSplitter.addPR(features, annieController);

		/* 9. Speech tagger */
		SpeechTagger speechTagger = new SpeechTagger();
		speechTagger.addPR(features, annieController);

		/* 10. */

		/* 11. Alias matcher */
		AliasMatcher aMatcher = new AliasMatcher();
		aMatcher.addPR(features, annieController);

		/* 12. */
		/* 13. */
		/* 14. */
		/* 15. */
		/* 16. Set corpus and files */
		/* 17. Run the PR through the corpus in the ANNIE */

	}
}
