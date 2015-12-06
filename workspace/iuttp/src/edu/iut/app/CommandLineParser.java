package edu.iut.app;

import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;

public class CommandLineParser {
	
	protected HashMap<String, CommandLineOption > options; /* EX1: option generique */
	protected ArrayList<String> parseErrors;
		/**
		 * constructeur
		 */
	public CommandLineParser() {
		options = new HashMap<String, CommandLineOption >();
		parseErrors = new ArrayList<String>();
	}
	/**
	 * constructeur avec parametres
	 * @param option
	 */
	public void addOption(CommandLineOption<?> option) {
		if (option != null) {
			options.put(option.getKey(),option);
		}
	}
	/**
	 * change les options
	 * @param args
	 */
	public void parse(String[] args) {
		for (String argument: args) {
			String[] keyValue=argument.split("=");
			if (options.containsKey(keyValue[0])) {
				switch (((CommandLineOption<?>)options.get(keyValue[0])).getOptionType()) {
					case FILE:
						CommandLineOption<File> fileOption = (CommandLineOption<File>)options.get(keyValue[0]);
						if (keyValue.length == 2) {
							fileOption.setValue(new File(keyValue[1]));
						}
						else {
							parseErrors.add("Option should have a key and a value.");
						}
					case STRING:
						CommandLineOption<File> fileOption1 = (CommandLineOption<File>)options.get(keyValue[0]);
						if (keyValue.length == 2) {
							fileOption1.setValue(new File(keyValue[1]));
						}
						else {
							parseErrors.add("Option should have a key and a value.");
						}
					case INTEGER:
						CommandLineOption<File> fileOption2 = (CommandLineOption<File>)options.get(keyValue[0]);
						if (keyValue.length == 2) {
							fileOption2.setValue(new File(keyValue[1]));
						}
						else {
							parseErrors.add("Option should have a key and a value.");
						}
					case DOUBLE:
						CommandLineOption<File> fileOption3 = (CommandLineOption<File>)options.get(keyValue[0]);
						if (keyValue.length == 2) {
							fileOption3.setValue(new File(keyValue[1]));
						}
						else {
							parseErrors.add("Option should have a key and a value.");
						}
					case NOVALUE:
						CommandLineOption<File> fileOption4 = (CommandLineOption<File>)options.get(keyValue[0]);
						if (keyValue.length == 2) {
							fileOption4.setValue(new File(keyValue[1]));
						}
						else {
							parseErrors.add("Option should have a key and a value.");
						}
					case NONE:
						CommandLineOption<File> fileOption5 = (CommandLineOption<File>)options.get(keyValue[0]);
						if (keyValue.length == 2) {
							fileOption5.setValue(new File(keyValue[1]));
						}
						else {
							parseErrors.add("Option should have a key and a value.");
						}
						break;
					/* EX1 : reproduire le comportement de 'case FILE', pour STRING,INTEGER, ... */

					default:
						parseErrors.add("Unrecognize option type.");						
				}
			}
		}
	}
	/**
	 * retourne la valeur key de l'option
	 * @param key
	 * @return
	 */
	public CommandLineOption<?> getOption(String key) {
		if (options.containsKey(key)) {
			return options.get(key);
		}
		return null;
	}
	/**
	 * retourne une arrayList de String
	 * @return
	 */
	public ArrayList<String> getErrors() {
		return parseErrors;
	}
	
}
