package fr.ig2i.aslan.gate;

import fr.ig2i.aslan.gate.annie.AliasMatcher;
import fr.ig2i.aslan.gate.annie.DefaultGazetteer;
import fr.ig2i.aslan.gate.annie.DocumentReset;
import fr.ig2i.aslan.gate.annie.Gazetteer;
import fr.ig2i.aslan.gate.annie.Morpher;
import fr.ig2i.aslan.gate.annie.POSTagger;
import fr.ig2i.aslan.gate.annie.PronominalCoreference;
import fr.ig2i.aslan.gate.annie.SentenceSplitter;
import fr.ig2i.aslan.gate.annie.Tokenizer;
import fr.ig2i.aslan.gate.annie.Transducer;
import fr.ig2i.aslan.gate.lang.LanguageIdentifier;
import gate.Corpus;
import gate.CorpusController;
import gate.Factory;
import gate.FeatureMap;
import gate.Gate;
import gate.creole.ExecutionException;
import gate.creole.ResourceInstantiationException;
import gate.creole.SerialAnalyserController;
import gate.persist.PersistenceException;
import gate.util.GateException;
import gate.util.Out;
import gate.util.persistence.PersistenceManager;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class App {

	private static SerialAnalyserController annieController;
	private static FeatureMap features = Factory.newFeatureMap();
	private static Corpus corpus;

	public enum Language {
		english, french, dutch
	}

	public static void main(String[] args) throws GateException, IOException {
		annotate("http://nl.wikipedia.org/wiki/Droogte");
	}

	public static void annotate(String texteURL) throws GateException,
			ResourceInstantiationException, MalformedURLException,
			ExecutionException, PersistenceException, IOException {
		/* 1. Initialize GATE library */
		InitApp.initGate();

		/* 2. Load Annie plugin */
		InitApp.loadAnnie();

		/* 3. Initialize ANNIE */
		annieController = InitApp.initAnnie();

		/* 4 Set Corpus */
		URL u = new URL(texteURL);
		corpus = InitApp.initCorpus(u);
		annieController.setCorpus(corpus);

		/* 5. Document Reset */
		features.clear();
		annieController.add(DocumentReset.PR(features));

		/* 6. Determine Language */
		features.clear();
		annieController.add(LanguageIdentifier.PR(features));

		// Executing Controller to get the language so to set the appropriate
		// PRs
		annieController.execute();

		// Reading language in the doc features
		String lang = InitApp.getLang();

		Out.print("Language detected : " + lang + "\n");

		switch (Language.valueOf(lang)) {
		case english:

			/* 7. Tokenizer */
			features.clear();
			annieController.add(Tokenizer.PR(features));

			/* 8. Sentences splitter */
			features.clear();
			annieController.add(SentenceSplitter.PR(features));

			/* 9. Speech tagger */
			features.clear();
			annieController.add(POSTagger.PR(features));

			/* 10. Morpher */
			features.clear();
			annieController.add(Morpher.PR(features));

			/* 11. Gazetteer */
			features.clear();
			annieController.add(DefaultGazetteer.PR(features));
			annieController.add(Gazetteer.PR(features));

			/* 12. Transducer */
			features.clear();
			annieController.add(Transducer.PR(features));

			/* 13. Alias matcher */
			features.clear();
			annieController.add(AliasMatcher.PR(features));

			/* 14. Pronominal Coreference */
			features.clear();
			annieController.add(PronominalCoreference.PR(features));

			/* 15. Testing that all PRs have the required parameters to run */
			System.out.println("Testing PRs");
			annieController.getOffendingPocessingResources();

			/* 16. Executing ANNIE */
			features.clear();
			annieController.execute();

			InitApp.printResults();
			break;
		case french:
			// It's possible to add TreeTagger to the plugin
			// For that, you just need to add "+tagger" to the path
			// /plugins/Lang_French/french+tagger.gapp
			CorpusController FRController = (CorpusController) PersistenceManager
					.loadObjectFromFile(new File(Gate.getPluginsHome(),
							"Lang_French/french.gapp"));
			FRController.setCorpus(corpus);
			FRController.execute();
			InitApp.printResults();
			break;
		case dutch:
			CorpusController NLController = (CorpusController) PersistenceManager
					.loadObjectFromFile(new File(Gate.getPluginsHome(),
							"OpenNLP/resources/opennlp-nl.gapp"));
			NLController.setCorpus(corpus);
			NLController.execute();
			InitApp.printResults();
			break;
		default:
			break;
		}
	}

}
