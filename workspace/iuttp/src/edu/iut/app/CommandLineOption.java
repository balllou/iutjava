package edu.iut.app;

public class CommandLineOption<ValueType> {

	public enum OptionType{
		NONE("None"),
		FILE("File"),
		STRING("String"),
		INTEGER("Integer"),
		DOUBLE("Double"),
		NOVALUE("NoValue");
		private String optionType;

		OptionType(String optionType) {
			this.optionType = optionType;
		}
		/**
		 * retourne le type d'option
		 */
		public String toString() {
			return optionType;
		}		
	}
	/**
	 * constructeur vide
	 */
	public CommandLineOption() {		
		/* EX1: Initializer les attributs */
		key="";
		description="aucune description";
		defaultValue=null;
		value = null;
		optionType = OptionType.NONE;
	}
	/**
	 * crée un CommandLineOption avec les constantes passées en parametre
	 * @param optionType
	 * @param key
	 * @param description
	 * @param defaultValue
	 */
	public CommandLineOption(final OptionType optionType, final String key, final String description, final ValueType defaultValue) {
		/* EX1 : Affecter les attributs */
		this.optionType=optionType;
		this.key=key;
		this.description=description;
		this.defaultValue=defaultValue;
	}
	/**
	 * change les options
	 * @param optionType
	 * @param key
	 * @param description
	 * @param defaultValue
	 */
	public void setOption(OptionType optionType, String key, String description, ValueType defaultValue) {
		/* EX1 : Affecter les attributs */
		this.optionType=optionType;
		this.key=key;
		this.description=description;
		this.defaultValue=defaultValue;
	}
	/**
	 * change l'attribut value
	 * @param value
	 */
	public  void setValue(ValueType value) {
		this.value = value;
	}
	/**
	 * retourne le valeur key
	 * @return
	 */
	public String getKey() {
		return this.key;
	}
	/**
	 * retourne la description
	 * @return
	 */
	public String getDescription() {
		return this.description;
	}
	/**
	 * retourne value
	 * @return
	 */
	public ValueType getValue() {
		if (value != null) {
			return value;
		}
		return defaultValue;
	}
	/**
	 * retourne le type d'option
	 * @return
	 */
	public OptionType getOptionType() {
		return optionType;
	}

	protected String key;
	protected String description;
	protected ValueType defaultValue;
	protected ValueType value;
	protected OptionType optionType;


}
