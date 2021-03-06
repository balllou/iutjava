package edu.iut.app;

import java.util.ArrayList;
import java.util.Date;

public class ExamEvent {
	
	/**
	 * constructeur
	 */
	public ExamEvent() {		
	}

	/**
	 * constructeur avec parametres
	 * @param date
	 * @param person
	 * @param jury
	 * @param classRoom
	 * @param document
	 */
	public ExamEvent(Date date, Person person, ArrayList<Person> jury,
			Classroom classRoom, ArrayList<Document> document) {
		examDate=date;
		student=person;
		this.jury=jury;
		classroom=classRoom;
		documents=document;

	}

	/** EX2: FAITE LES ACCESSEURS DES ATTRIBUTS, AJOUTER DES ATTRIBUT ? **/
	protected Date examDate;
	protected Person student;
	protected ArrayList<Person> jury;
	protected Classroom classroom;
	protected ArrayList<Document> documents;


	/**
	 * accesseur retourne la valeur de examDate
	 * @return
	 */
	public Date getExamDate() {
		return examDate;
	}

	/**
	 * accesseur d�finit examDate par la valeur pass�e en parametres
	 * @param examDate
	 */
	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	/**
	 * accesseur retourne l'attribut student
	 * @return
	 */
	public Person getStudent() {
		return student;
	}

	/**
	 * accesseur change l'attribut student par la valeur pass�e en parametres
	 * @param student
	 */
	public void setStudent(Person student) {
		this.student = student;
	}

	/**
	 * accesseur retourne l'arrayList de personnes jury
	 * @return
	 */
	public ArrayList<Person> getJury() {
		return jury;
	}

	/**
	 * accesseur change l'arrayList de personnes jury par la valeur pass�e en parametres
	 * @param jury
	 */
	public void setJury(ArrayList<Person> jury) {
		this.jury = jury;
	}

	/**
	 * accesseur retourne classroom
	 * @return
	 */
	public Classroom getClassroom() {
		return classroom;
	}

	/**
	 * accesseur classroom par la valeur pass�e en parametres
	 * @param classroom
	 */
	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

	/**
	 * accesseur retourne l'arrayList de documents
	 * @return
	 */
	public ArrayList<Document> getDocuments() {
		return documents;
	}

	/**
	 * accesseur change l'arrayList de documents par la valeur pass�e en parametres
	 * @param documents
	 */
	public void setDocuments(ArrayList<Document> documents) {
		this.documents = documents;
	}

}
