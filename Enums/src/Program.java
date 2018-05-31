
enum Colors { 
	Red, Green, Blue;
	
	public String upperName() {
		return this.name().toUpperCase();
	} 
	
}

// class Colors extends Enum<Colors>

public class Program {

	public static void main(String[] args) {
		Colors c1 = Colors.Green;
		System.out.println(c1.name());
		System.out.println(c1.ordinal());
		System.out.println(c1.upperName());
		
		Colors c2 = Colors.valueOf("Blue");
		
		for(Colors c : Colors.values())
			System.out.println(c);
		

	}

}
