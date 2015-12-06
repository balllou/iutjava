package edu.iut.app;

public class ApplicationInfoLog extends AbstractApplicationLog {

	public ApplicationInfoLog() {
		super();
	}
	/**
	 * définit le message avec la valeur passée en parametre
	 */
	@Override
	public void setMessage(String message) {
		this.message = message;
		ApplicationSession.instance().getGUILogger().info(this.message);
        super.fireMessage("[INFO]", this.message);
	}

}
