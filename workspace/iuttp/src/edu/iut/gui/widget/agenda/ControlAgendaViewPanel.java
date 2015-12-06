package edu.iut.gui.widget.agenda;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerModel;

import edu.iut.app.ApplicationSession;

public class ControlAgendaViewPanel extends JPanel {

	CardLayout agendaViewLayout;
	JPanel contentPane;
	
	int selectedYear;
	int selectedMonth;
	int selectedDay;
	
	/**
	 * constructeur
	 * @param layerLayout
	 * @param contentPane
	 */
	public ControlAgendaViewPanel(CardLayout layerLayout, final JPanel contentPane) {

		this.agendaViewLayout = layerLayout;
		this.contentPane = contentPane;
		/** EX3: REMPLACEMENT DU BOUTON NEXT */
	}
	
	/**
	 * retourne l'année selectionnée
	 * @return
	 */
	public int getYear() {
		return selectedYear;
	}
	/**
	 * retourne le mois selectionné
	 * @return
	 */
	public int getMonth() {
		return selectedMonth;
	}
	/**
	 * retourne le jour selectionné
	 * @return
	 */
	public int getDay() {
		return selectedDay;
	}
	
}
