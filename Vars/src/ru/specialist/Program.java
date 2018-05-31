package ru.specialist;

public class Program {
	
	public static final double PI = 3.1415;
	
	
	public static int q = 10;

	final static String userName = "abc";

	public static void main(String[] args) {

		{
			int p = 10;
			System.out.println(p);
		}
		{
			String p = "abc";
			System.out.println(p);
		}

		{

			for (int i = 1; i <= 10; i++)
				System.out.println(i);

			int z = 5;

			int x, a, b;

			x = 10 + 1;

			int c = x * 2;

			String s = null;

			s = "abc";

			int y;

			y = x + 2;

			System.out.println(x);
			System.out.println(y);
			System.out.println(s.length());
			System.out.println(q);
		}
		{
			byte b = 20;
			int a = 5 / 2;
			
			long l = (2 + 3) * 4;
			// + - * / %
			
			l = a; // implicit conv
			l = 1L;
					//Long.MAX_VALUE;
			// cast
			int Я = (int)l; // explicit conv
			
			l = a + b;
			
			System.out.println(a);
			System.out.println(l);
			System.out.println(Я);
		}
		{
			long a = Integer.MAX_VALUE + 1L;
			System.out.println(a);
		}
		{
			final int a = 1; // const
			final int c = q + 1; // not const
			double b = (double)a / 2;
			System.out.println(b);
		}
		{
			double d = 2d; // 2e5
			float f = 1.5F;
			// + - * /
		}
		{
			char ch = 'A';
			char ch2 = '\u003F';
		}
		{
			boolean a = true;
			boolean b = false;
			
			// кнцхвеяйне х
			boolean c = a && b;
			// кнцхвеяйне хкх
			c = a || b;
			// кнцхвеяйне ме
			c = !a;
			
			c = a && !b;
			c = !(a && b); // !a || !b
			
			c = a || !b;
			
			System.out.println(c);
			//int Integer
			//long Long
			//char Character
			int x = 10;
			Integer y = x; // boxing
			int z = y; // unboxing
			
			Integer u = y * y;
		}
		{
			int a = 10;
			boolean r = (a >= 0) && (a <= 100);
			//boolean r = (a - 5) == (a / 2);
			/*
			 * ==
			 * !=
			 * >
			 * <
			 * >=
			 * <=
			 */
			System.out.println(r);
		}
		{
			int a = 10;
			int b = (a = 5);
			
		}
		{
			int x = 10;
			// x = x * 2;
			// x *= 2;
			//x = x + 1;
			//x += 1;
			//int y = x++ + ++x;
			//      10  + 12
			int y =  ++x + x++;
			//       11  + 11
			
			System.out.printf("x = %d\ny = %d\n",x,y);
		}
		{
			int a = 5; // 0101
			int b = 7; // 0111
			
			int c = a & b; // 0101
			c = a | b; // 0111
			c = a ^ b; // 0010
			// a ^ b ^ b == a
			c = ~a;
			//  000000000000000000101
			//  111111111111111111010
			//(~x+1) == -x
			// 0101 5
			// 1011 -5
			//10000
			c = a << 2; // 0101 << 2 == 010100
			
			a = -5;
			c = a >> 2; // 0101 >> 2 == 0001
			System.out.println(c);
			c = a >>> 2;
			System.out.println(c);
			
			int x = 7; // 0111
			int b1 = (x >> 1) & 1;
			int b2 = (x & 2) >> 1;
		}
		{
			int x = 0x8; // 000000... 1 ..00000
			           // 000000... 0 ..11111
			
			           // 00000..1.000 100000
			           // 00000..1.0000011111
			
			
			//boolean r = (x & (x-1) ) == 0;
			boolean r = ( x & -x ) == x;
			
			
			System.out.println(r);
			
			
			
		}

	}

}
