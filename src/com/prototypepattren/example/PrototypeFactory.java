package com.prototypepattren.example;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
	public static class ModelType {
		public static final String Customer = "customer";
		public static final String FoodItem = "foodItem";
	}
	
	private static Map<String,IPrototypePattren> prototypesOfClasses =
													new HashMap<String,IPrototypePattren>();
	
	static {
		prototypesOfClasses.put(ModelType.Customer, new Customer());
		prototypesOfClasses.put(ModelType.FoodItem, new FoodItem());
	}
	
	public static IPrototypePattren getInstance(final String classInstance) throws CloneNotSupportedException{
		return (prototypesOfClasses.get(classInstance)).clone();
	}
}
