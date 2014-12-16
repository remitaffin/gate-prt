package fr.ig2i.aslan.gate;

import gate.Gate;
import gate.util.GateException;

import java.io.File;
import java.net.MalformedURLException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class InitApp {

	private static Logger LOGGER = Logger.getRootLogger();

	public static void initGate() throws GateException {
		BasicConfigurator.configure();/* Set log4j.properties path */
		if (!Gate.isInitialised()) {
			LOGGER.info("\nInitialising GATE...");
			System.setProperty("gate.home", ".."); /* Set Gate Home */
			Gate.init();
			LOGGER.info("...GATE initialised");
		}
	}

	@SuppressWarnings("deprecation")
	public static void loadAnnie() {
		LOGGER.info("\nLoading ANNIE...");
		File gateHome = Gate.getGateHome();
		File pluginsHome = new File(gateHome, "plugins");
		try {
			Gate.getCreoleRegister().registerDirectories(
					new File(pluginsHome, "ANNIE").toURL());
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (GateException ex) {
			ex.printStackTrace();
		}
		LOGGER.info("...ANNIE loaded");
	}
}
