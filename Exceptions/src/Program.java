
public class Program {

	static void test(String s1, String s2)
		throws MyException
	{
		try
		{
			int n1 = Integer.parseInt(s1);
			int n2 = Integer.parseInt(s2);
			
			if (n1 > 100 || n1 < 0)
				throw new MyException("n1 out of [0..100]", n1);
			
			int n = n1 / n2;
			
			
			
			System.out.println(n);
		}
		catch(NumberFormatException ex) {
			System.out.println("не число");
			throw new RuntimeException(ex);
		}
		finally {
			System.out.println("finally");
		}
		/*catch(ArithmeticException | NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}
		catch(RuntimeException ex) {
			System.out.println(ex.getMessage());
		}
		*/
		System.out.println("продолжение test");
	}

	public static void main(String[] args) {
		try
		{
			test("123", "0");
		}
		catch(ArithmeticException ex) {
			System.out.println("ƒеление на ноль");
		}
		catch(MyException ex) {
			System.out.printf("%s : invalid data : %d\n", 
					ex.getMessage(), ex.getInvalidData());
		}

		System.out.println("продолжение main");

	}

}
