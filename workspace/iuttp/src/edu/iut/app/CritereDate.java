package edu.iut.app;

import java.sql.Date;
import java.util.LinkedList;

public class CritereDate implements Critere{

	
	public LinkedList<ExamEvent> meetCriteria(LinkedList<ExamEvent> events,Date date) {
		LinkedList<ExamEvent> eventDate = new LinkedList<ExamEvent>(); 
	      
	      for (ExamEvent unEvent : events) {
	         if(unEvent.getExamDate()==date){
	        	 eventDate.add(unEvent);
	         }
	      }
	      return eventDate;
	   }
	

	@Override
	public LinkedList<ExamEvent> meetCriteria(LinkedList<ExamEvent> events) {
		// TODO Auto-generated method stub
		return null;
	}

}