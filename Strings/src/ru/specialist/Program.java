package ru.specialist;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		String s = "\\a\nb\"c\u004F";
		String hello = "Привет";
		String name = "Сергей";
		
		String r = hello + " " + name + "!";
		
		System.out.println(s);
		System.out.println(r);
		
		System.out.println( r.length() );
		System.out.println( r.charAt(0) );
		System.out.println( r.charAt(r.length()-1) );
		//r = null;
		//if (r != null)
		System.out.println( r.isEmpty() );
		System.out.println( r.trim().isEmpty() );
		System.out.println( r.contains("Сергей") );
		System.out.println( r.indexOf("Сергей") );
		System.out.println( r.substring(7, 13) );
		System.out.println( r.toUpperCase() );
		System.out.println( r );
		System.out.println( r.replace("Сергей", "Андрей") );
		// r = r.replace("Сергей", "Андрей") ; 
		System.out.println( r );
		
		StringBuilder sb = new StringBuilder();
		for(int i=1; i <= 100; i++)
			sb.append(i).append(" ");
		
		String result = sb.toString();
		
		// very bad
		//String result = "";
		//for(int i=1; i <= 100; i++)
		//	result = result + String.valueOf(i)+" ";
		
		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		//String s1 = sc.nextLine();
		final String s3 = "й";
		String s1 = "Серге"+s3;
		String s2 = "Сергей";
		
		//System.out.println( s1 == s2 );
		System.out.println( s1.equals(s2) );
		
		
		
		
		
		

	}

}
