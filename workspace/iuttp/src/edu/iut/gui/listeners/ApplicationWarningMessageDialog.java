package edu.iut.gui.listeners;

import javax.swing.JOptionPane;

public class ApplicationWarningMessageDialog extends
		AbstractApplicationMessageDialog {

	/**
	 * affiche un warning
	 */
	@Override
	protected void showMessage(String level, String message) {
		JOptionPane.showMessageDialog(null, message, level, JOptionPane.WARNING_MESSAGE, null);
	}

}
