package by.it_academy.java_enterprise.knyazev;

import java.util.Arrays;
import java.util.List;

import by.it_academy.java_enterprise.knyazev.entities.Person;

public class PersonService {
	private final static int NMUM_OF_PERSONS_IN_DB = 5;
	private final static Person DEFAULT_PERSON = new Person("Ivanov", "Ivan", 6, "Georgia");
	private List<Person> persons;
	
	
	public PersonService() {
		createPersonsList();
	}
	
	private void createPersonsList() {
		Person person1 = new Person("Alik", "Saginashvili", 22, "Georgia");
		Person person2 = new Person("Vasya", "Ivanov", 29, "Russia");
		Person person3 = new Person("Stalik", "Irago", 38, "Georgia");
		Person person4 = new Person("Maria", "Dovidenko", 35, "Ukraine");
		Person person5 = new Person("Jhon", "Dao", 38, "United Kingdom");
		
		Person[] personsArr = {person1, person2, person3, person4, person5};
		
		persons = Arrays.asList(personsArr);
	}

	public Person getPersonFomDB(int id) {
		if (id < 0 || id >= NMUM_OF_PERSONS_IN_DB) return DEFAULT_PERSON;
		return persons.get(id);
	}
	
	

}