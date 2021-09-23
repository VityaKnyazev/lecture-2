package by.it_academy.java_enterprise.knyazev;

import java.util.Random;

import com.google.common.base.Joiner;

import by.it_academy.java_enterprise.knyazev.entities.Person;

public class Logic {
	private static Logic logic;
	private PersonService personService;
	
	private Logic() {
		personService = new PersonService();
	}
	
	public static Logic getInstance() {
		if (logic == null) {
			logic = new Logic();
		}
		
		return logic;
	}
	
	public String getLogicalResult() {
		Random rnd = new Random();
		int randomId = rnd.nextInt(5);
		
		Person randomPerson = personService.getPersonFomDB(randomId);
		
		Joiner joiner = Joiner.on(" ");
		String result = joiner.join("<h2>", "Hello from", randomPerson, "</h2>");
		return result;
	}
}
