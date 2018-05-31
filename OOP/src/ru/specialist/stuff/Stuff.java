package ru.specialist.stuff;

//import java.math.BigDecimal;

public class Stuff extends Person {
	//BigDecimal salary;
	
	int age;
	
	public double salary;
	
	public Stuff(String name, int age) {
		this(name, age, 100d);
	}
	public Stuff(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}
	
	
	public void addBonus(double bonus) {
		salary += bonus;
	}
	
	@Override
	public void show() {
		//super.show();
		//System.out.printf("%.2f\n", salary);
		System.out.printf("%s - %d : %.2f\n", 
				name,
				this.age,
				salary);
	}
	
	
	
	
	
	
	
	
	
	
}
