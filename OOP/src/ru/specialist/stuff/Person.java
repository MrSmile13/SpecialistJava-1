package ru.specialist.stuff;

import java.time.LocalDate;

public class Person //implements Comparable<Person> 
{
	
	public String name; // = "Незнакомец";
	//public /*final*/ int age;// = 18;
	//private int age;
	private int birthYear;
	
	public int getAge() {
		return LocalDate.now().getYear()-birthYear;
	}
	
	public void setAge(int age) {
		this.birthYear = LocalDate.now().getYear()-age;
	}
	
	public static int counter = 0;
	
	{
		//age = 18;
	}
	
	static {
		counter = 0;
	}
	
	public static void showTotal()
	{
		System.out.printf("Total persons: %d\n",
				Person.counter);
	}
	
	public Person() {
		this("Unknown");
		//System.out.println("Person()");
		//show();
		//System.out.println("abc");
		//this.name = "Unknown";
		//this.age  = 18;
	}
	public Person(String name) {
		this(name, 18);
		//this.name = name;
		//this.age  = 18;
	}
	public Person(String name, int age) {
		this.name = name;
		//this.age  = age;
		setAge(age);
		
		//Person.counter++;
		counter++;
	}
	
	int show;
	
	public void show() {
		System.out.printf("%s - %d\n", this.name, getAge());
	}
	
	@Override
	public Person clone() {
		return new Person(this.name, this.getAge());
	}

	/*@Override
	public int compareTo(Person p) {
		//return this.name.compareTo(p.name);
		return this.getAge()-p.getAge();
	}*/

}
