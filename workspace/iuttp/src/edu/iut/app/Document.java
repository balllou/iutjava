package edu.iut.app;

public class Document {
	/**
	 * constructeur vide
	 */
	public Document() {
		documentURI="";
	}
	/**
	 * constructeur avec parametre
	 * @param documentURI
	 */
	public Document(String documentURI) {
		/* EX2 : Affectation */
		this.documentURI=documentURI;
	}
	/**
	 * change la valeur de documentURI par la valeur passée en parametre
	 * @param number
	 */
	public void setDocumentURI(String number) {
		this.documentURI = number;
	}
	/**
	 * retourne documentURI
	 * @return
	 */
	public String getDocumentURI() {
		return documentURI;
	}
	
	protected String documentURI;
}
