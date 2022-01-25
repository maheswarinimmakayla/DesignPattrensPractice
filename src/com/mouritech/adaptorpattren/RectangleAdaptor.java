package com.mouritech.adaptorpattren;

public class RectangleAdaptor 
	extends RectangleShape{
		
		private SqureShape sShape;
		
		public RectangleAdaptor(SqureShape sShape) {
			this.sShape = sShape;
		}
		
		public void fillColor(String color) {
			sShape.colourSquare(color);
		}
}
