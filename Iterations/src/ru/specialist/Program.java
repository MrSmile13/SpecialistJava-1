package ru.specialist;

public class Program {

	public static void main(String[] args) {
		for(int i=1; i <= 10 ; i++) {
			if (i == 8) break;
			if (i == 3) continue;
			System.out.println(i);
		}
		
		// 1 2 3 ... 10
		// 2 4 6 ... 20
		// 3 6 9 ... 30
		
		metka:
		for(int i=1; i <= 10; i++) {
			for(int j=1; j <= 10; j++) {
				if (j == 5) break metka;
				System.out.printf("%4d", i*j);
			}
			System.out.println();
		}
		System.out.println("\nпродолжение");
		
		int a = 2000;
		//for(;a < 1000;) {
		while (a < 1000) {
			System.out.println(a);
			a *= 2; // a  = a*2
		}
		
		int y;
		int z = (y = 5);
		
		a = 2;
		do {
			System.out.println(a);
			//a *= 2; // a = a*2
		} while ( (a *= 2) < 1000);
		
		// 0 1 1 2 3 5 8 13
		
		int k1=0,k2=1, k;
		System.out.println(k1);
		System.out.println(k2);
		
		while ( (k = k1 + k2) < 1000 ) {
			System.out.println(k);
			k1 = k2;
			k2 = k;
		}
		
		

	}

}
