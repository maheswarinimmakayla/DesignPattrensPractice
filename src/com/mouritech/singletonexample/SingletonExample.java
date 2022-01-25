package com.mouritech.singletonexample;

public class SingletonExample {
	
		
		public static SingletonExample sdpe = new SingletonExample();
		
		private SingletonExample() {
			System.out.println("Creating the instance ..............");
		}
		
		private static SingletonExample getInstance() {
			return sdpe;
		}

		public static void main(String[] args) {
			
			SingletonExample sdpe1 = SingletonExample.getInstance();
			SingletonExample sdpe2 = SingletonExample.getInstance();
			System.out.println("Hashcode of sdpe1  =  " + sdpe1.hashCode());
			System.out.println("Hashcode of sdpe2  =  " + sdpe2.hashCode());
		}
}

