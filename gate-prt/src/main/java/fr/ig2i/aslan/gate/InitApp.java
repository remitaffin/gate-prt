package fr.ig2i.aslan.gate;

import gate.Factory;
import gate.Gate;
import gate.creole.ResourceInstantiationException;
import gate.creole.SerialAnalyserController;
import gate.util.GateException;

import java.io.File;
import java.net.MalformedURLException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class InitApp {

	private static Logger LOGGER = Logger.getRootLogger();
	private static SerialAnalyserController annieController;

	public static void initGate() throws GateException {
		BasicConfigurator.configure();/* Set log4j.properties path */
		if (!Gate.isInitialised()) {
			LOGGER.info("\nInitialising GATE...");
			System.setProperty("gate.home", ".."); /* Set Gate Home */
			Gate.init();
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
	}

	public static SerialAnalyserController initAnnie()
			throws ResourceInstantiationException {
		LOGGER.info("\nInitialising ANNIE...");
		return setAnnieController((SerialAnalyserController) Factory
				.createResource("gate.creole.SerialAnalyserController",
						Factory.newFeatureMap(), Factory.newFeatureMap(),
						"ANNIE_" + Gate.genSym()));
	}

	public static SerialAnalyserController getAnnieController() {
		return annieController;
	}

	public static SerialAnalyserController setAnnieController(
			SerialAnalyserController annieController) {
		InitApp.annieController = annieController;
		return annieController;
	}
}
