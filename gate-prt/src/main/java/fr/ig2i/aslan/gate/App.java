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
		Out.prln("begin");
		
		
		//FIRST TRYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY
		//cc = initCorpus();
		//Out.prln("corpus controller created");
		
		//	      (CorpusController) PersistenceManager.loadObjectFromFile(annieGapp);
		/*Corpus corpus = Factory.newCorpus("MyCorpus");
		for(int i = 0; i < args.length; i++) {
		      URL u = new URL(args[i]);
		      FeatureMap params = Factory.newFeatureMap();
		      params.put("sourceUrl", u);
		      params.put("preserveOriginalContent", new Boolean(true));
		      params.put("collectRepositioningInfo", new Boolean(true));
		      Out.prln("Creating doc for " + u);
		      Document doc = (Document)
		        Factory.createResource("gate.corpora.DocumentImpl", params);
		      corpus.add(doc);
		      Out.prln("passage "+i);
		    } // for each of args
		
		Out.prln("out for");
		// tell the pipeline about the corpus and run it
		App myApp = new App();
		Out.prln("heeeeeeeeere000000");
		myApp.setCorpus(corpus);
		Out.prln("heeeeeeeeere111111");*/
		
		
		//second tryyyyyyyyyyyyyy
		
		
		FeatureMap params = Factory.newFeatureMap();
		params.put("sourceUrl", args[0].toString());
		params.put("markupAware", true);
		params.put("preserveOriginalContent", false);
		params.put("collectRepositioningInfo", false);
		params.put("encoding","windows-1252");
		Out.prln("Creating doc for " + args[0].toString());
		Document doc = null;
		try {
		corpus = Factory.newCorpus("myCorpus");
		doc = (Document)
		Factory.createResource("gate.corpora.DocumentImpl", params);
		} catch (ResourceInstantiationException ex) {
		ex.printStackTrace();
		}
		corpus.add(doc);
		annieController.setCorpus(corpus);
		params.clear();
		
		
		
		
		

		/* 5. Document Reset */
		features.clear();
		Out.prln("h22222222222");
		annieController.add(DocumentReset.PR(features));
		Out.prln("h3333333333");
		
		/* 6. Tokenizer */
		features.clear();
		annieController.add(Tokenizer.PR(features));
		Out.prln("h44444444");
		
		/* 7. Gazetteer */
		features.clear();
		annieController.add(Gazetteer.PR());
		Out.prln("h55555555555");

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
	
	/** Tell ANNIE's controller about the corpus you want to run on */
	  public void setCorpus(Corpus corpus) {
	    cc.setCorpus(corpus);
	  } // setCorpus
	  
	  public static CorpusController initCorpus() throws GateException, IOException {
		    Out.prln("Initialising ANNIE...");
		    CorpusController cc_;
		    // load the ANNIE application from the saved state in plugins/ANNIE
		    File pluginsHome = Gate.getPluginsHome();
		    File anniePlugin = new File(pluginsHome, "ANNIE");
		    File annieGapp = new File(anniePlugin, "ANNIE_with_defaults.gapp");
		    cc_ =
		      (CorpusController) PersistenceManager.loadObjectFromFile(annieGapp);

		    Out.prln("...ANNIE loaded");
		    
		    return cc_;
		  }
}
