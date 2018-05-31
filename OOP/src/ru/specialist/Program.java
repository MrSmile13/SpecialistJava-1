package ru.specialist;

import ru.specialist.stuff.Person;
import ru.specialist.stuff.Stuff;
import ru.specialist.graph.*;
import static java.lang.Math.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class PersonComparatorByName implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		return p1.name.compareTo(p2.name);
	}
	
}

public class Program {
	
	public static int comparePerson(Person p1, Person p2) {
		return p1.getAge() - p2.getAge();
	}
	

	public static void main(String[] args) {
		{
			int a = 5;
			int b = a;
			a++;
			System.out.printf("a=%d\nb=%d\n", a,b);
		}
		{
			int[] a = {5};
			int[] b = a.clone();
			a[0]++;
			System.out.printf("a=%d\nb=%d\n", a[0],b[0]);
		}
		
		{
			double x = 5;
			double y = sin(2*PI*x);
			
		}
		{
			Person.showTotal();
			
			Person p1 = new Person("Сергей", 40);
			// p1.name = "Сергей";
			// p1.age = 40;
			Person pk = p1.clone();
			p1.name = "Костя";
			p1.show();
			pk.show();
			

			Person p2 = new Person("Наталия", 35);
			// p2.name = "Наталия";
			// p2.age = 35;

			Person px = new Person();
			
			p1.show();
			p2.show();
			px.show();
			
			Stuff s1 = new Stuff("Директор", 50, 500);
			//s1.salary = 1000d;
			
			s1.addBonus(500d);
			s1.show();
			
			//Person.showTotal();
		}
		{
			Point p1 = new Point(10, 20);
			//p1.draw();
			p1.moveBy(1, 2);
			p1.draw();  // Point.draw
			
			/* 
			 * Method	Class	Address
			 * draw		Shape	XXX
			 * draw		Point	YYY
			 * draw		Circle	ZZZ
			
			*/
			Shape s1 = p1;
			s1.color = "red";
			s1.draw(); // Point.draw
			if (s1 instanceof Point) {
				Point p2 = (Point)s1;
				p2.moveBy(2, 2);
			}
			
			
			
			//Point p2 = Point.create(100, 200); 
					//new Point(100, 200);
			//Point.drawScene();
			
			Circle c1 = new Circle(100, 200, 50, "green");
			c1.scale(-1.5);
			c1.setR(-10);
			System.out.println(c1.getR());
			
			s1  = c1;
			s1.draw(); // Circle.draw
			if (s1 instanceof Point) {
				Point p2 = (Point)s1;
				p2.moveBy(2, 2);
			}
			
			Object o1 = p1;
			o1 = c1;
			o1 = "abc";
			o1 = 2.5; // new Double(2.5)
			
			if (o1 instanceof Double) {
				double d = (double)o1;
			}
			
			Shape s2; // = new Shape();
			//Scaleable sc = c1;
			//sc.scale(factor);
			c1.scale();
			
			
			//Point p3 = (Point)s1;
			//System.out.println(p1.toString());
			//Shape.drawScene();
			
			
		}
		{
			Singleton s1 = Singleton.getInstance(); 
					//new Singleton();
			Singleton s2 = Singleton.getInstance(); 
					// new Singleton();
			
			System.out.println(s1);
			System.out.println(s2);
			
		}
		{
			Person p1 = new Person("Сергей", 40);
			Person p2 = new Person("Наталия", 36);
			Person p3 = new Person("Костя", 11);
			Person p4 = new Person("Саша", 8);
			
			ArrayList<Person> persons = 
					new ArrayList<>();
			persons.add(p1);
			persons.add(p2);
			persons.add(p3);
			persons.add(p4);
			
			Comparator<Person> byName = 
					new PersonComparatorByName();
			
			/*Collections.sort(persons, 
			new Comparator<Person>() {
				public int compare(Person x1, Person x2) {
					return x1.getAge() - x2.getAge();
				}
				
			});*/
			
			/*final*/ int k = 2;
			//k++;
			
			//final Program p = new Program();
			
			Collections.sort(persons, 
				//(x1, x2) -> k*x1.getAge() - x2.getAge()
				//(x1, x2) -> p.comparePerson(x1, x2)
				//	p::comparePerson
				// (x1, x2) -> Program.comparePerson(x1, x2)
					Program::comparePerson
			);
			
			for(Person p : persons)
				p.show();

			
		}

	}

}
