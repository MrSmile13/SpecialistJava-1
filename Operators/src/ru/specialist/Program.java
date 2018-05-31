package ru.specialist;

public class Program {

	public static void main(String[] args) {
		int a = -10;
		if (a > 0) {
			System.out.println("a больше нул€");
			System.out.println("a > 0");
		}
		else { 
			if (a > -100)
				System.out.println("a больше -100");
			else
				System.out.println("a Ќ≈ больше нул€");
		}
		
		int n = 0;
		String s = (n == 0) ? "ноль" : "не ноль";
		/*String s;
		if (n == 0)
			s = "ноль";
		else
			s = "не ноль";*/
		
		int x = -1;
		final int p = 1;
		switch(x) {
			case -1:
			case p : 
				System.out.println("один"); 
				break; // return
			case p+1 : System.out.println("два");break; 
			case 3 : System.out.println("три");break;
			 
		}
		
		// на ветке 5 ворон
		
		
			
		
			

	}

}
