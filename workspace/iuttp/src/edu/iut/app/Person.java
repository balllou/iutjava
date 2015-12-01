package edu.iut.app;

public class Person {

	public enum PersonFunction{
		/* EX2 : Internationalisation */
		NONE("None"),
		JURY("Jury"),
		STUDENT("Student");

		private String personFunction;

		PersonFunction(String personFunction) {
			this.personFunction = personFunction;
		}

		public String toString() {
			return personFunction;
		}		
	}

	/**
	 * constructeur
	 */
	public Person() {
		personFunction = PersonFunction.NONE;
	}

	/**
	 * constructeur avec parametres
	 * @param personFunction
	 * @param firstname
	 * @param lastname
	 * @param email
	 * @param phone
	 */
	public Person(PersonFunction personFunction,String firstname,String lastname,String email,String phone) {
		this.personFunction = personFunction;
		this.firstname=firstname;
		this.lastname=lastname;
		this.email=email;
		this.phone=phone;
	}
	/**
	 * accesseur
	 * @param function
	 */
	public void setFunction(PersonFunction function) {
		this.personFunction = function;
	}
	/**
	 * accesseur
	 * @return
	 */
	public PersonFunction getFunction() {
		return personFunction;
	}

	/**
	 * accesseur
	 * @param firstname
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * accesseur
	 * @return
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * accesseur
	 * @param lastname
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * accesseur
	 * @return
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * accesseur
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * accesseur
	 * @return
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * accesseur
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * accesseur
	 * @return
	 */
	public String getPhone() {
		return phone;
	}


	protected PersonFunction personFunction;
	protected String firstname;
	protected String lastname;
	protected String email;
	protected String phone;


}
