package edu.iut.app;

import java.util.LinkedList;

public class Agenda extends LinkedList<ExamEvent>/* EX2: COLLECTION d'ExamEvent */ {
	/**
	 * cr�e un agenda vide
	 */
	public Agenda() {	
		
	}
	/**
	 * ajoute un event � l'agenda
	 * @param examEvent
	 */
	public void addCheckedEvent(ExamEvent examEvent) {
		this.add(examEvent);
	}
	
}
