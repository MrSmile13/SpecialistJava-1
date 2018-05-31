
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Program {

	public static void main(String[] args) {
		
		//ArrayList<String> persons = new ArrayList<String>();
		//Collection<String> persons = new ArrayList<String>();
		LinkedList<String> persons = new LinkedList<String>();
		System.out.println( persons.size() );
		persons.add("Сергей");
		persons.add("Наталия");
		persons.add("Костя");
		persons.add("Саша");
		
		persons.remove("Костя");
		//persons.remove(2);
		persons.set(2, "Глаша");
		
		System.out.println( persons.size() );
		
		Collections.sort(persons);
		
		/*Iterator<String> iter = persons.iterator();
		while (iter.hasNext()) {
			String p = iter.next();
			System.out.println(p);
		}*/
		
		for(String p : persons)
			System.out.println(p);
		
		
		
		
		// bad
		//for(int i=0; i < persons.size(); i++)
		//	System.out.println( persons.get(i));
		
		

	}

}
