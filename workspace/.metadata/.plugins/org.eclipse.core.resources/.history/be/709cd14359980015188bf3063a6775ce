package edu.iut.gui.frames;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import edu.iut.gui.listeners.ListenerItem;
import edu.iut.gui.widget.agenda.AgendaPanelFactory;
import edu.iut.gui.widget.agenda.ControlAgendaViewPanel;
import edu.iut.gui.widget.agenda.AgendaPanelFactory.ActiveView;


public class SchedulerFrame extends JFrame {
	JPanel contentPane;
	CardLayout layerLayout;
	AgendaPanelFactory agendaPanelFactory;	
	public static JPanel dayView;
	public static JPanel weekView;
	public static JPanel monthView;
	public static JMenu menu;
	public static JMenu menu2;
	public static JMenuItem month;
	public static JMenuItem display;
	public static JMenuItem about;
	public static JMenuItem week;
	public static JMenuItem day;
	public static JMenuItem load;
	public static JMenuItem save;
	public static JMenuItem quit;
	
	/**
	 * crée le fenetre
	 */
	protected void setupUI() {
		
		contentPane = new JPanel();
		layerLayout = new CardLayout();
		contentPane.setLayout(layerLayout);
		ControlAgendaViewPanel agendaViewPanel = new ControlAgendaViewPanel(layerLayout,contentPane);
		agendaPanelFactory = new AgendaPanelFactory();
		dayView = agendaPanelFactory.getAgendaView(ActiveView.DAY_VIEW);
		weekView = agendaPanelFactory.getAgendaView(ActiveView.WEEK_VIEW);
		monthView = agendaPanelFactory.getAgendaView(ActiveView.MONTH_VIEW);
		
		contentPane.add(dayView,ActiveView.DAY_VIEW.name());
		contentPane.add(weekView,ActiveView.WEEK_VIEW.name());
		contentPane.add(monthView,ActiveView.MONTH_VIEW.name());
	
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,agendaViewPanel, contentPane);
		this.setContentPane(splitPane);
		
		JMenuBar menuBar = new JMenuBar();
		
		
		/* File Menu */
		/** EX4 : MENU : UTILISER L'AIDE FOURNIE DANS LE TP**/
		
		//actionlisteners
		
		
		
		// menu Help
		menu= new JMenu("Help");
		display = new JMenuItem("Display");
		menu.add(display);
		about = new JMenuItem("About");
		menu.add(about);
		menuBar.add(menu);
		//menu Edit
		menu = new JMenu("Edit");
		menu2 = new JMenu("View");
		month = new JMenuItem("Month");
		month.addActionListener(new ListenerItem());
		menu2.add(month);
		week = new JMenuItem("Week");
		week.addActionListener(new ListenerItem());
		menu2.add(week);
		day = new JMenuItem("Day");
		day.addActionListener(new ListenerItem());
		menu2.add(day);
		menu.add(menu2);
		menuBar.add(menu);
		//menu File
		menu = new JMenu("File");
		load = new JMenuItem("Load");
		menu.add(load);
		save = new JMenuItem("Save");
		menu.add(save);
		quit = new JMenuItem("Quit");
		menu.add(quit);
		menuBar.add(menu);
		
		
		this.setJMenuBar(menuBar);
		this.pack();
		layerLayout.next(contentPane);
	}
	/**
	 * constructeur
	 */
	public SchedulerFrame() {
		super();
		
		addWindowListener (new WindowAdapter(){
			public void windowClosing (WindowEvent e){
				System.exit(0);
			}
		});
		contentPane = null;
		dayView = null;
		weekView = null;
		monthView = null;
		agendaPanelFactory = null;
		setupUI();

	}
	/**
	 * constructeur avec titre de la fenetre
	 * @param title
	 */
	public SchedulerFrame(String title) {
		super(title);
		addWindowListener (new WindowAdapter(){
			public void windowClosing (WindowEvent e){
				System.exit(0);
			}
		});
		setupUI();
	}
	
}
