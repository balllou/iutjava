package edu.iut.app;

import java.util.LinkedList;

public class CritereStudent implements Critere{
	LinkedList<ExamEvent> etudiants = new LinkedList<ExamEvent>();

	/**
	 * retourne une LinkedList des etudiants d'un event
	 */
	@Override
	public LinkedList<ExamEvent> meetCriteria(LinkedList<ExamEvent> events) {
		for (ExamEvent E : events) {
			if(E.toString().equalsIgnoreCase("STUDENT")){
				etudiants.add(E);
			}
		}
		return etudiants;
	}

}
