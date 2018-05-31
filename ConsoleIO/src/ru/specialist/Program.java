package ru.specialist;

//import java.util.Date;
//import java.util.Calendar;
import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) 
			//throws IOException  
	{
		// tc * 9 / 5 +32
		
		
		Program p;
		
		System.out.print("Hello ");
		System.out.println("Sergey!");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Имя: ");
		String name = sc.nextLine();
		System.out.print("Возраст: ");
		int age = sc.nextInt();
		// sc.nextDouble()
		
		
		/*BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("Имя: ");
		String name = reader.readLine();
		System.out.print("Возраст: ");
		//String ageStr = reader.readLine(); 
		//int age = Integer.parseInt(ageStr);
		int age = Integer.parseInt(reader.readLine());
		// Double.parseDouble
		*/
		
		String s = String.format("Привет, %2$d - %1$s!", name, age);
		System.out.println(s);
		
		// Привет, Сергей - 40!
		System.out.printf("Привет, %-20s - 0x%x!\n", name, age);
		System.out.printf("pi = %10.3f\n", Math.PI);
		
		Date now = new Date();
		
		System.out.printf("%1$tY-%1$tm-%1$td\n", now);
		System.out.printf("%tY-%<tm-%<td\n", now);
		System.out.printf("%tF\n", now);
		System.out.printf("%tR\n", now);
		now.setMinutes(now.getMinutes()+15);
		System.out.printf("%tR\n", now);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
