package edu.iut.app;

import java.util.LinkedList;

public interface Critere {
	
	public LinkedList<ExamEvent> meetCriteria(LinkedList<ExamEvent> events);

}
