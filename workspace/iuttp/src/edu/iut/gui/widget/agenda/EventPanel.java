package edu.iut.gui.widget.agenda;
import javax.swing.JPanel;

public class EventPanel extends JPanel {
	
	protected AgendaPanelFactory.ActiveView activeView;
	/**
	 * cnostructeur avec parametres
	 * @param activeView
	 */
	public EventPanel(AgendaPanelFactory.ActiveView activeView) {
		this.activeView = activeView;
	}

}
