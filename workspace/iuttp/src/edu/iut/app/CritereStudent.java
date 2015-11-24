package edu.iut.app;

import java.util.LinkedList;

public class CritereStudent {
	LinkedList<ExamEvent> femalePersons = new LinkedList<ExamEvent>(); 
    
    for (Person person : persons) {
       if(person.toString().equalsIgnoreCase("STUDENT")){
          femalePersons.add(person);
       }
    }
    return femalePersons;
}
