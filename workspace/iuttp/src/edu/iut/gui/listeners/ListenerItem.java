package edu.iut.gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iut.gui.frames.SchedulerFrame;

public class ListenerItem implements ActionListener{

	/**
	 * permet de changer de vue en fonction du bouton du menu selectionne
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==SchedulerFrame.month){
		SchedulerFrame.monthView.setVisible(true);
		SchedulerFrame.weekView.setVisible(false);
		SchedulerFrame.dayView.setVisible(false);
		}
		if(e.getSource()==SchedulerFrame.week){
			SchedulerFrame.monthView.setVisible(false);
			SchedulerFrame.weekView.setVisible(true);
			SchedulerFrame.dayView.setVisible(false);
			}
		if(e.getSource()==SchedulerFrame.day){
			SchedulerFrame.monthView.setVisible(false);
			SchedulerFrame.weekView.setVisible(false);
			SchedulerFrame.dayView.setVisible(true);
			}
	}

}
