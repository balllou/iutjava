package edu.iut.app;

import java.util.LinkedList;

public class CritereNone implements Critere{
	
	LinkedList<ExamEvent> none = new LinkedList<ExamEvent>();
	
	@Override
	public LinkedList<ExamEvent> meetCriteria(LinkedList<ExamEvent> events) {
		for (ExamEvent E : events) {
			if(E.toString().equalsIgnoreCase("NONE")){
				none.add(E);
			}
		}
		return none;
}

}
