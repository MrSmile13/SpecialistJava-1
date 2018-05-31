package ru.specialist.graph;

@FunctionalInterface
public interface Scaleable {
	
	public static final double DEFAULT_FACTOR = 2D;
	
	void scale(double factor);
	
	// since Java 9
	private void myScale() {
		this.scale(DEFAULT_FACTOR);
	}
	
	// since Java 8
	default void scale() {
		System.out.println("Scaleable.scale()");
		myScale();
	}

}

interface Scaleable3D extends Scaleable{
	void scale3D(double factorX, double factorY, double factorZ);
	
}
