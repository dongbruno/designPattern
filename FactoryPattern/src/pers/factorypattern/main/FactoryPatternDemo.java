package pers.factorypattern.main;

import pers.factorypattern.factory.ShapeFactory;
import pers.factorypattern.shape.Shape;

public class FactoryPatternDemo {

	public static void main(String args[]) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape circle = shapeFactory.getShape("circle");
		circle.draw();
		Shape rectangle = shapeFactory.getShape("rectangle");
		rectangle.draw();
		Shape square = shapeFactory.getShape("square");
		square.draw();
	}
}
