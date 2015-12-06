package edu.iut.app;

public class Classroom {
	/**
	 * constructeur
	 */
	public Classroom() {
		classRoomNumber="not affected";
	}
	/**
	 * cr�e une Classroom avec son num�ro pass� en parametre
	 * @param classRoomNumber
	 */
	public Classroom(String classRoomNumber) {
		/* EX2: AFFECTATION */;
		this.classRoomNumber=classRoomNumber;
	}
	/**
	 * d�finit le num�ro de salle
	 * @param number
	 */
	public void setClassroomNumber(String number) {
		/* EX2: AFFECTATION */;
		classRoomNumber=number;
	}
	/**
	 * retourne le num�ro de salle
	 * @return
	 */
	public String getClassRoomNumber() {
		return classRoomNumber;
	}
	
	protected String classRoomNumber;
}
