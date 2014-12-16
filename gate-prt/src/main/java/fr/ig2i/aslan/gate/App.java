package fr.ig2i.aslan.gate;

import gate.util.GateException;

public class App {

	public static void main(String[] args) throws GateException {
		
		/* 1. initialisze GATE library */
		InitApp.initGate();
		/* 2. load Annie plugin */
		InitApp.loadAnnie();
	}
}
