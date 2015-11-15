package edu.iut.app;

import java.util.ArrayList;

public abstract class AbstractApplicationLog implements IApplicationLog {

	protected String message;
	/** TP1 : Tableau au sens des collections **/
	protected ArrayList<IApplicationLogListener > listeners; 

	public AbstractApplicationLog() {
		message = null;
		listeners = new ArrayList<IApplicationLogListener>(); /*TYPE TABLEAU*/
	}

	/** TP1 : Fonction venant de l'interface par héritage */
	public  void setMessage(String message){
		this.message = message;
	}

	public void addListener(IApplicationLogListener listener){
		this.listeners.add(listener);
	}

	public IApplicationLogListener[] getapplicationLogListeners(){

		IApplicationLogListener[] tab = new IApplicationLogListener[this.listeners.size()];
		int i=0;
		for (IApplicationLogListener x : this.listeners){
			tab[i]=x;
			i++;
		}

		return tab;
	}



	/** Listener action */
	protected void fireMessage(String level, String message) {
		for (IApplicationLogListener listener_i : listeners) {
			listener_i.newMessage(level, message);
		}
	}
}
