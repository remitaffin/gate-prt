package fr.ig2i.aslan.gate.restjersey;

import fr.ig2i.aslan.gate.InitApp;
import gate.Gate;
import gate.util.GateException;

import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

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
