package ru.specialist.graph;

import java.util.ArrayList;

public final class Point extends Shape{
	public int x, y;
	
	//static ArrayList<Point> scene = 
	//		new ArrayList<Point>();
	
	public Point () {
		this(0, 0);
	}
	
	public Point (int x, int y) {
		this(x,y,DEFAULT_COLOR);
	}
	public Point (int x, int y, String color) {
		super(color);
		this.x = x;
		this.y = y;
		//scene.add(this); // bad
	}
	
	/*public static Point create(int x, int y)
	{
		Point p = new Point(x,y);
		scene.add(p);
		return p;
	}*/
	
	
	public void moveBy(int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	@Override
	public void draw() {
		System.out.printf("Point (%d, %d). %s\n", 
				this.x,this.y, this.color);
		
	}

}
