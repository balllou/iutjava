package edu.iut.app;

public class ApplicationErrorLog extends AbstractApplicationLog {

	public ApplicationErrorLog() {
		super();
	}
	/**
	 * d�finit le message avec la valeur pass�e en parametre
	 */
	@Override
	public void setMessage(String message) {
		this.message = message;
		ApplicationSession.instance().getGUILogger().severe(this.message);
		super.fireMessage("[ERROR]", this.message);
	}


}
