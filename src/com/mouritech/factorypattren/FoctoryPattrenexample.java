package com.mouritech.factorypattren;

public class FoctoryPattrenexample {
public static void main(String[] args) {
		
		//create a Triangle
		Shape shape = ShapeFactory.getShape("3");
		shape.calculate();
		
		//create a square
		shape = ShapeFactory.getShape("4");
		shape.calculate();
		
		//create circle
		shape = ShapeFactory.getShape("0");
		shape.calculate();

	}
}
