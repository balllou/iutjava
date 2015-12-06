package edu.iut.gui.listeners;

import javax.swing.JOptionPane;

public class ApplicationErrorMessageDialog extends
		AbstractApplicationMessageDialog {

	/**
	 * affiche un message d'erreur
	 */
	@Override
	protected void showMessage(String level, String message) {
		JOptionPane.showMessageDialog(null, message, level, JOptionPane.ERROR_MESSAGE, null);
	}

}
