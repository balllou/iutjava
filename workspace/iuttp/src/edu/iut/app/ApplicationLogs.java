package edu.iut.app;

import java.util.ArrayList;


public class ApplicationLogs extends ArrayList<IApplicationLog> {

	public ApplicationLogs() {		
	}
	/**
	 * retourne les erreurs
	 * @return
	 */
	public ArrayList<IApplicationLog> getErrors() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		for (IApplicationLog a : this) {
			if (a instanceof ApplicationErrorLog) {
				filteredLogs.add(a);
			}
		}
		return filteredLogs;
	}
	/**
	 * retourne les warnings
	 * @return
	 */
	public ArrayList<IApplicationLog> getWarnings() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		for (IApplicationLog a : this) {
			if (a instanceof ApplicationWarningLog) {
				filteredLogs.add(a);
			}
		}
		return filteredLogs;
	}
	/**
	 * retourne les insfos
	 * @return
	 */
	public ArrayList<IApplicationLog> getInfos() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		for (IApplicationLog a : this) {
			if (a instanceof ApplicationInfoLog) {
				filteredLogs.add(a);
			}
		}
		return filteredLogs;
	}
	

}
