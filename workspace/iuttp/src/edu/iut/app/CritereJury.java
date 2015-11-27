package edu.iut.app;

import java.util.LinkedList;

public class CritereJury implements Critere{

	LinkedList<ExamEvent> jury = new LinkedList<ExamEvent>();
	
		@Override
		public LinkedList<ExamEvent> meetCriteria(LinkedList<ExamEvent> events) {
			for (ExamEvent E : events) {
				if(E.toString().equalsIgnoreCase("JURY")){
					jury.add(E);
				}
			}
			return jury;
	}

}
