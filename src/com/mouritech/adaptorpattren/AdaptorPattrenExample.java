package com.mouritech.adaptorpattren;

public class AdaptorPattrenExample {
public static void main(String[] args) {
		
		RectangleShape rs = new RectangleShape();
		rs.colourRectangle("green");
		
		SqureShape ss = new SqureShape();
		RectangleAdaptor rad = new RectangleAdaptor(ss);
		rad.colourRectangle("orange");
	}

}
