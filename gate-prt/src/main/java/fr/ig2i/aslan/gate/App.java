package fr.ig2i.aslan.gate;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import fr.ig2i.aslan.gate.annie.*;
import fr.ig2i.aslan.gate.lang.*;
import gate.Corpus;
import gate.CorpusController;
import gate.Factory;
import gate.FeatureMap;
import gate.Gate;
import gate.ProcessingResource;
import gate.creole.SerialAnalyserController;
import gate.util.GateException;
import gate.util.Out;
import gate.util.persistence.PersistenceManager;


public class App {

	private static SerialAnalyserController annieController;
	private static FeatureMap features = Factory.newFeatureMap();
	private static Corpus corpus;
	
	public enum Language {
	    english,
	    french,
	    dutch
	}
	
	public static void main(String[] args) throws GateException, IOException {

		/* 1. Initialize GATE library */
		InitApp.initGate();

		/* 2. Load Annie plugin */
		InitApp.loadAnnie();

		/* 3. Initialize ANNIE */
		annieController = InitApp.initAnnie();
		
		/* 4 Set Corpus */
		URL u = new URL("http://nl.wikipedia.org/wiki/Droogte");
		corpus=InitApp.initCorpus(u);
		annieController.setCorpus(corpus);
		
		/* 5. Document Reset */
		features.clear();
		annieController.add(DocumentReset.PR(features));

		/* 6. Determine Language */
		features.clear();
		annieController.add(LanguageIdentifier.PR(features));
		
		//Executing Controller to get the language so to set the appropriate PRs
		annieController.execute();
		
		//Reading language in the doc features
		String lang = InitApp.getLang();

		Out.print("Language detected : " + lang + "\n");

		/*TODO
		 * Add all necessary PRs for FR EN and Dutch
		 * load appropriate PRs for each language : */
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
			    //WARNING !!!! Il faut installer TreeTagger et renseigner l'emplacement de l'executable dans /plugins/Lang_French/french+tagger.gapp, si vous avez la flemme enlevez "+tagger" deux lignes en dessous
			    CorpusController FRController =
			      (CorpusController)PersistenceManager.loadObjectFromFile(new File(Gate.getPluginsHome(), "Lang_French/french.gapp"));
				FRController.setCorpus(corpus);
				FRController.execute();
				InitApp.printResults();
			    break;
			case dutch:
			    CorpusController NLController =
			      (CorpusController)PersistenceManager.loadObjectFromFile(new File(Gate.getPluginsHome(), "OpenNLP/resources/opennlp-nl.gapp"));
				NLController.setCorpus(corpus);
				NLController.execute();
				InitApp.printResults();
			    break;
			default:  
			    break; 
		}


	}
	
}
