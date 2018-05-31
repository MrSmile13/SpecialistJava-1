package ru.specialist;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		//Locale.setDefault(new Locale("ru"));
		Locale ru = new Locale("ru");
		Locale.setDefault(Locale.US);
		
		System.out.print("T (c): ");
		Scanner sc = new Scanner(System.in);
		double tc  = sc.nextDouble();
		
		double tf = tc * 9 / 5.0 + 32;
		
		System.out.printf("T (F): %.2f\n", tf);
		

	}

}
