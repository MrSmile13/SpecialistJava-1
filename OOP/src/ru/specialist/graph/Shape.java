package ru.specialist.graph;

import java.util.ArrayList;

/*
 * 	Modifier	Access Level	Visibility
 * 	public		public			World
 *				package			this package 
 */
public abstract class Shape {
	
	public static final String DEFAULT_COLOR = "black";
	
	/*
	 * 	Modifier	Access Level	Visibility
	 * 	public		public			World
	 * 	private		private			this class
	 * 				package			this package
	 * 	protected	protected		this package + subclass	
	 */
	public String color;
	
	static ArrayList<Shape> scene = 
			new ArrayList<Shape>();
	
	public Shape() {
		this(DEFAULT_COLOR);
	}
	public Shape(String color) {
		this.color = color;
		scene.add(this); // bad
	}
	
	public static void drawScene()
	{
		for(Shape p : scene)
			p.draw();
	}
	
	public static void scaleScene(double scale)
	{
		for(Shape p : scene) {
			if (p instanceof Scaleable) {
				Scaleable s = (Scaleable)p;
				s.scale(scale);
			}
			
			/*
			//bad
			if (p instanceof Circle) {
				Circle c = (Circle)p;
				c.scale(scale);
			}*/
		}
	}
	
	public abstract void draw();
	//{
		//System.out.printf("Shape. %s\n", color);
	//}

}
