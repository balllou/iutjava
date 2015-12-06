package edu.iut.app;

public class ApplicationErrorLog extends AbstractApplicationLog {

	public ApplicationErrorLog() {
		super();
	}
	/**
	 * définit le message avec la valeur passée en parametre
	 */
	@Override
	public void setMessage(String message) {
		this.message = message;
		ApplicationSession.instance().getGUILogger().severe(this.message);
		super.fireMessage("[ERROR]", this.message);
	}


}
