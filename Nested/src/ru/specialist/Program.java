package ru.specialist;

public class Program {

	public static void main(String[] args) {
		Outer.Nested n = new Outer.Nested();
		Outer o = new Outer(10);
		n.increment(o);
		//o.data++;
		
		Outer.Inner i1 = o.new Inner();
		Outer.Inner i2 = o.new Inner();
		
		System.out.println(o.getData());

	}

}
