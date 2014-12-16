package fr.ig2i.aslan.gate;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import fr.ig2i.aslan.gate.gazetteer.Gazetteer;
import fr.ig2i.aslan.gate.sentence_splitter.SentenceSplitter;
import gate.Gate;
import gate.util.GateException;


public class App {
	private static Logger LOGGER = Logger.getRootLogger();
	static SentenceSplitter s = new SentenceSplitter();
	static Gazetteer g = new Gazetteer();
	
	public static void main(String[] args) throws GateException {
		//Set log4j.properties path
		BasicConfigurator.configure();
		if (!Gate.isInitialised()) {
			LOGGER.info("Initialising GATE...");
			//Set Gate Home
			System.setProperty("gate.home", "..");
			//Initialize Gate
			Gate.init();
			LOGGER.info("...GATE initialised");
		}
	}
}
