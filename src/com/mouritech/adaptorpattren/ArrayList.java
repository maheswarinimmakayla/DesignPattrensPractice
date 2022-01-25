package com.mouritech.adaptorpattren;

import java.util.Arrays;
import java.util.List;

public class ArrayList {
	public static void main(String[] args) {
		Integer[] arrayInt = new Integer[]{56,78,89,90,67};
		
		List<Integer> integerList = Arrays.asList(arrayInt);
		System.out.println(integerList);

	}

}
