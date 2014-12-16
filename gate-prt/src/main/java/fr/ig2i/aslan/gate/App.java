package fr.ig2i.aslan.gate;

import gate.Gate;
import gate.util.GateException;

import org.apache.log4j.Logger;

public class App {

	private static Logger LOGGER = Logger.getRootLogger();

	public static void main(String[] args) throws GateException {
		if (!Gate.isInitialised()) {
			LOGGER.info("Initialising GATE...");

			LOGGER.info("...GATE initialised");
		}
	}

}
