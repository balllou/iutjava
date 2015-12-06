package edu.iut.app;

import java.util.LinkedList;

public class CritereJury implements Critere{

	LinkedList<ExamEvent> jury = new LinkedList<ExamEvent>();
	
	/**
	 * retourne une LinkedList du jury d'un event
	 */
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
