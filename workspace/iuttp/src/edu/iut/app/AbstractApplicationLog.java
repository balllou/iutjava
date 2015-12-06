package edu.iut.app;

import java.util.ArrayList;

public abstract class AbstractApplicationLog implements IApplicationLog {

	protected String message;
	protected ArrayList<IApplicationLogListener> listeners;
	/**
	 * constructeur
	 */
	public AbstractApplicationLog() {
		message = null;
		listeners = new ArrayList<IApplicationLogListener>();
	}
	/**
	 * d�finit le message avec la valeur pass�e en parametre
	 */
	@Override
	public abstract void setMessage(String message);

	/**
	 * retourne la valeur du message
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * ajoute un listener a l'arrayList de listener
	 */
	@Override
	public void addListener(IApplicationLogListener listener) {
		listeners.add(listener);

	}
	/**
	 * retourne la liste des listener
	 */
	@Override
	public IApplicationLogListener[] getApplicationLogListeners() {
		return (IApplicationLogListener[])listeners.toArray();
	}
	
	/**
	 * cr�e un message et l'affiche
	 * @param level
	 * @param message
	 */
	protected void fireMessage(String level, String message) {
		for (IApplicationLogListener listener_i : listeners) {
			listener_i.newMessage(level, message);
		}
	}
}
