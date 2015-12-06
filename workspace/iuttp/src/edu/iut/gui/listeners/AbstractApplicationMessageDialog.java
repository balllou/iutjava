package edu.iut.gui.listeners;

import edu.iut.app.IApplicationLogListener;

public abstract class AbstractApplicationMessageDialog implements
		IApplicationLogListener {

	/**
	 * crée un message et l'affiche
	 */
	@Override
	public void newMessage(String level, String message) {
	 showMessage(level, message);

	}
	/**
	 * affiche un message
	 */
	protected abstract void showMessage(String level, String message);

}
