

import java.util.Date;

//import static java.lang.Math.sqrt;
//import static java.lang.Math.log;
//import static java.lang.Math.PI;
//import static java.lang.Math.sin;
import static java.lang.Math.*;
import static java.lang.System.out;

public class Program {
	
	//  int gcd(int a, int b)
	// k1 > k2
	// k1 % k2 = k3
	// k2 % k3 = k4
	
	public static int gcd(int a, int b) {
		int c;
		while ( (c = a % b) != 0 ) {
			a = b;
			b = c;
		}
		return b;
	}
	
	public static int gcd(int... m) {
		if (m == null || m.length == 0)
			throw new ArithmeticException();
		
		if (m.length == 1) return m[0];
		
		int k = gcd(m[0], m[1]);
		for(int i=2; i < m.length; i++)
			k = gcd(k, m[i]);
		
		return k;
	}
	
	
	public static double average(int... m) {
		int summa = 0;
		for(int k : m)
			summa += k;
		
		return (double)summa / m.length;
	
	}

	public static double average(int a, int b) {
		double avg = (a+b)/2d;
		return avg;
	}
	public static void sayHello() {
		sayHello("Незнакомец");
	}
	public static void sayHello(int age) {
		out.printf("Привет, %d!\n", age);
	}
	public static void sayHello(String name) {
		out.printf("Привет, %s!\n", name);
	}
	
	public static void sayHello(String name, int age) {
		System.out.printf("Привет, %s - %d!\n", name, age);
		//return;
	}
	
	static void test1(int a) {
		a++;
		System.out.printf("test 1 a = %d\n", a); // 11
	}
	
	static void test2(int[] a) {
		a[0]++;
		System.out.printf("test 2 a = %d\n", a[0]); // 11
	}
	
	public static void main(String[] args) {
		{
			int[] a = new int[]{10};
			test2(a);
			System.out.printf("main 2 a = %d\n", a[0]); // 11
		}
		{
			int a = 10;
			test1(a);
			System.out.printf("main 1 a = %d\n", a); // 10
		}
		//Program p = new Program();
		//p.sayHello();
		//p.sayHello();
		//Program.sayHello();
		sayHello("Сергей", 40);
		sayHello("Наталия", 35);
		sayHello("Костя");
		sayHello(18);
		sayHello();
		
		
		
		// sqrt(log(sin(PI*x)))
		double x = 9;
		
		double y = sqrt(log(sin(PI*x)));
		
		y = average(10, 11);
		out.println(y);
		
		out.println( average(11, 12) );
		
		out.println( average(new int[] {11,12,13,14}) );
		out.println( average(11,12,13,14,15) );
		
		out.println( gcd(1071, 462) );
		out.println( gcd(462, 1071) );
		
		out.println( gcd(1071, 14, 462) );
		

	}

}
