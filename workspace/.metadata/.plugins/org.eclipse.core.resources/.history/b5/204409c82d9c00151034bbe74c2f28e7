package edu.iut.app;

import java.util.LinkedList;

public class CritereSalle implements Critere{

	LinkedList<ExamEvent> salles = new LinkedList<ExamEvent>();
	public LinkedList<ExamEvent> meetCriteria(LinkedList<ExamEvent> events,String numSalle) {
		for (ExamEvent E : events) {
			if(E.toString().equalsIgnoreCase(numSalle)){
				salles.add(E);
			}
		}
		return salles;
	}
	

	@Override
	public LinkedList<ExamEvent> meetCriteria(LinkedList<ExamEvent> events) {
		// TODO Auto-generated method stub
		return null;
	}

}
