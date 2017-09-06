package pers.factorypattern.factory;


import pers.factorypattern.shape.Circle;
import pers.factorypattern.shape.Rectangle;
import pers.factorypattern.shape.Shape;
import pers.factorypattern.shape.Square;

public class ShapeFactory {
	public Shape getShape(String shape) {
		if(shape == null) {
			return null;
		}
		if(shape.equalsIgnoreCase("circle")) {
			return new Circle();
		} else if(shape.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		} else if(shape.equalsIgnoreCase("square")) {
			return new Square();
		}
		return null;
	}
}
