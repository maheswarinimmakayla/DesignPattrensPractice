package com.prototypepattren.example;

import com.prototypepattren.example.PrototypeFactory.ModelType;

public class PrototypePattrenExample {
public static void main(String[] args) {
		
		try {
			
			String customerPrototype = PrototypeFactory.getInstance(ModelType.Customer).toString();
			System.out.println(customerPrototype);
			
			
			String foodItemPrototype = PrototypeFactory.getInstance(ModelType.FoodItem).toString();
			System.out.println(foodItemPrototype);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
}
