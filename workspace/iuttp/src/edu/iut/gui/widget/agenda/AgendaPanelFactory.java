package edu.iut.gui.widget.agenda;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JLabel;
import javax.swing.JPanel;

import edu.iut.gui.widget.agenda.WeekPanel.WeekDayNames;

public class AgendaPanelFactory {

	public enum ActiveView{
		MONTH_VIEW("Month View"),
		WEEK_VIEW("Week View"),
		DAY_VIEW("Day View");
		
		private String activeView;
		
		ActiveView(String activeView) {
			this.activeView = activeView;
		}
		
		/**
		 * retourne la vue active
		 */
		public String toString() {
			return activeView;
		}		
	}
	
	/**
	 * constructeur
	 */
	public AgendaPanelFactory() {
	}
	/**
	 * changela vue en fonction de la vue active	 
	 * * @param activeView
	 * @return
	 */
	public JPanel getAgendaView(ActiveView activeView) {
		JPanel agendaView = null;
		switch (activeView) {
			case MONTH_VIEW:
				MonthPanel monthPanel = new MonthPanel();
				agendaView = monthPanel;
				break;
			case WEEK_VIEW:
				WeekPanel weekPanel = new WeekPanel();
				agendaView = weekPanel;
				break;
			case DAY_VIEW:
				DayPanel dayPanel = new DayPanel(activeView,WeekDayNames.EMPTYDAY);
				agendaView = dayPanel;
				break;
			default:
				break;				
		}
		return agendaView;
	}

}
