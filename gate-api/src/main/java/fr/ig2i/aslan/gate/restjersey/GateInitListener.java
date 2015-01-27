package fr.ig2i.aslan.gate.restjersey;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import fr.ig2i.aslan.gate.InitApp;

public class GateInitListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent arg0) {
		try {
			System.out.println("Context Initialized !!");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public void contextInitialized(ServletContextEvent event) {
		/* Sets the context in a static variable */
        InitApp.setServletContext(event.getServletContext());
	}

}
