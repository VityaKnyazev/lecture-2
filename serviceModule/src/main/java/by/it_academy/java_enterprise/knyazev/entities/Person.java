package by.it_academy.java_enterprise.knyazev.entities;

public class Person {
	private String name;
	private String familyName;
	private int age;
	private String nationality;

	public Person(String name, String familyName, int age, String nationality) {
		this.name = name;
		this.familyName = familyName;
		this.age = age;
		this.nationality = nationality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return name + " " + familyName + ", " + age + " years old, " + " from " + nationality;
	}	
	
}
