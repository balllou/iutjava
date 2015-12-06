package edu.iut.app;

import java.util.LinkedList;

public class Agenda extends LinkedList<ExamEvent>/* EX2: COLLECTION d'ExamEvent */ {
	/**
	 * crée un agenda vide
	 */
	public Agenda() {	
		
	}
	/**
	 * ajoute un event à l'agenda
	 * @param examEvent
	 */
	public void addCheckedEvent(ExamEvent examEvent) {
		this.add(examEvent);
	}
	
}
