package edu.iut.app;

public class Classroom {
	/**
	 * constructeur
	 */
	public Classroom() {
		classRoomNumber="not affected";
	}
	/**
	 * crée une Classroom avec son numéro passé en parametre
	 * @param classRoomNumber
	 */
	public Classroom(String classRoomNumber) {
		/* EX2: AFFECTATION */;
		this.classRoomNumber=classRoomNumber;
	}
	/**
	 * définit le numéro de salle
	 * @param number
	 */
	public void setClassroomNumber(String number) {
		/* EX2: AFFECTATION */;
		classRoomNumber=number;
	}
	/**
	 * retourne le numéro de salle
	 * @return
	 */
	public String getClassRoomNumber() {
		return classRoomNumber;
	}
	
	protected String classRoomNumber;
}
