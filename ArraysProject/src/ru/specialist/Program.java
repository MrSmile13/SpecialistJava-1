package ru.specialist;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		//int[] nums = new int[3];
		//nums[0] = 100;
		//nums[1] = 200;
		
		//int[] nums = new int[] {100, 200, 0}; 
		int[] nums = {100, 200, 0};
		
		System.out.println( nums.length );
		for(int i=0; i < nums.length; i++)
			System.out.println( nums[i] );
		
		//System.out.println( nums[0] );
		//System.out.println( nums[1] );
		//System.out.println( nums[2] );
		
		String[] names = new String[]
				{"Сергей", "Наталия", "Саша", "Костя"};
		
		Arrays.sort(names);
		
		System.out.println( names[0].length() );
		for(String name : names)
			System.out.println(name);
		
		//for(int i=0; i < names.length; i++)
		//	System.out.println(names[i]);
		
		
		//for(int i=names.length-1; i >= 0; i--)
		//	System.out.println(names[i]);
		
		// 1 2 3
		// 4 5 6
		
		int[][] m = new int[][] {
			{1,2,3},
			{4,5}
		};
		
		System.out.println(m.length);
		for(int i=0; i < m.length; i++) {
			for(int j=0; j < m[i].length; j++)
				System.out.printf("%4d", m[i][j]);
			System.out.println();
		}
		
		byte n = -128;
		//new String()
		char[] bits = new char[8];
		for(int i=bits.length-1; i >= 0; i--)
		{
			bits[i] = (n & 1)==1 ? '1' : '0';
			n >>>= 1; //n = n >>> 1;
		}
		String bt = new String(bits);
		
		System.out.println(bt);
			
		
		
		
		
		
		
		
		
		
		
		

	}

}
