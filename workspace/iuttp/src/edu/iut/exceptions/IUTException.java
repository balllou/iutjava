package edu.iut.exceptions;

public class IUTException extends Exception {
	/**
	 * cr�e une exeption vide
	 */
	public IUTException() {
		super();
		edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe("empty");
	}
	/**
	 * cr�e une exeption qui a our message la valeur de l'exeption pass� en parametres 
	 * @param e
	 */
	public IUTException(IUTException e) {
		super (e);
		edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe(e.getMessage());
	}
	/**
	 * cr"e une exeption avec pour message celui pass� en parametre
	 * @param message
	 */
	public IUTException(String message) {
		super(message);
		edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe(message);
	}
	
}
