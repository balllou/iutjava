package edu.iut.app;

public class ApplicationWarningLog extends AbstractApplicationLog {

	public ApplicationWarningLog() {
		super();
	}
	/**
	 * definit le message avec le String passé en parametre
	 */
	@Override
	public void setMessage(String message) {
		this.message = message;
		ApplicationSession.instance().getGUILogger().warning(this.message);
		super.fireMessage("[WARNING]", this.message);
	}
}
