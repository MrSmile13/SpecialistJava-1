package ru.specialist;

public class Outer {
	
	public static class Nested {
		public void increment(Outer o) {
			o.data++;
		}
	}
	
	public class Inner {
		int data;
		public void increment() {
			Outer.this.data++;
		}
	}
	
	private int data;
	
	public boolean isGreater(int x) {
		Comparable<Integer> cmp = 
		new Comparable<Integer>(){
			public int compareTo(Integer x) {
				return data-x;
			}
			
		};
		
		
		return cmp.compareTo(x) > 0;
		
	}
	
	/*Comparable<Integer> getMyComparator() {
		class MyComparator implements Comparable<Integer>{
			public int compareTo(Integer x) {
				return data-x;
			}
			
		}
		
		Comparable<Integer> cmp = new MyComparator();	
		return cmp;
	}
	
	public boolean isGreater(int x) {
		
		Comparable<Integer> cmp = getMyComparator();
		return cmp.compareTo(x) > 0;
		
	}*/

	public int getData() {
		Nested n = new Nested();
		return data;
	}

	public Outer(int data) {
		this.data = data;
	}
	


}
