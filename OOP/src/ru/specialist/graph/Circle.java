package ru.specialist.graph;

import java.io.Serializable;

public class Circle extends Shape 
	implements Scaleable, Serializable
{
	public int x,y;
	private transient int r;
	
	public int getR() {
		return r;
	}
	
	public void setR(int r) {
		if (r > 0)
			this.r = r;
	}
	
	public Circle(int x, int y, int r) {
		this(x,y,r,DEFAULT_COLOR);
	}
	public Circle(int x, int y, int r, String color) {
		super(color);
		this.x = x;
		this.y = y;
		//this.r = r;
		setR(r);
	}
	
	@Override
	public final void draw() {
		//System.out.println(this.toString());
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return String.format("Circle (%d, %d) R: %d. %s",
				x,y,getR(),color);
	}
	
	public void scale(double factor) {
		//r = (int)(r*factor);
		setR((int)(getR()*factor));
	}
	
	public void scale() {
		// ....
		System.out.println("Circle.scale()");
		Scaleable.super.scale(); // call default impl Scaleable
	}


	

}
