
public class Program {
	
	/*public static boolean isGreater(int x, int y) {
		return x > y;
	}
	public static boolean isGreater(String x, String y) {
		return x.compareTo(y) > 0;
	}*/
	public static <T extends Comparable<T>> boolean 
		isGreater(T x, T y) {
		return x.compareTo(y) > 0;
	}
	
	public static void main(String[] args) {
		System.out.println(isGreater(10, 5));
		System.out.println(isGreater(5.5, 2.5));
		System.out.println(isGreater("a", "c"));
		
		ReadonlyStorage<Integer> r1 = 
				new ReadonlyStorage<Integer>(10);
		ReadonlyStorage<Double> r2 = 
				new ReadonlyStorage<>(2.5);
		ReadonlyStorage<String> r3 = 
				new ReadonlyStorage<String>("abc");
		
		//ReadonlyStorage<Program> r4 = 
		//		new ReadonlyStorage<Program>(new Program());
		//ReadonlyStorage<?> x;
		
		//ReadonlyStorage<Object> r4 = new ReadonlyStorage<>("abc");
		
		System.out.println( r1.getData()*2);
		System.out.println( r2.getData());
		System.out.println( r3.getData().length());
	}

}
