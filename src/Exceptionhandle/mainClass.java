package Exceptionhandle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

abstract class SuperClass {

	abstract void goodMorning(int i);
}

class ChildClass extends SuperClass {

	void goodMorning(int i) {
		System.out.println(i / 0);
	}
}

class Jocker {

	private static final SuperClass childClass;

	static {
		childClass = new ChildClass();
	}

	public static void getResult() {
		try {
			childClass.goodMorning(10);
		} catch (Exception e) {
			System.out.println("Jocker class");
			childClass.goodMorning(10);
		}
	}

}

public class mainClass {

	public static void main(String[] args) throws UncheckeExcption {
//		ageValidate(14);
		validateArrayrange();
		
	}

	static void ageValidate(int value) throws UncheckeExcption {

		if (value <= 18) {
			throw new UncheckeExcption("The Person is not eligible to vote", value);
		} else {
			System.out.println("the person is eligble o vote");
		}
	}

	static String ageValidateOne(int value) {

		return (value <= 18) ? "The Person is not eligible to vote" : "the person is eligble to vote";
	}
	
	static void validateArrayrange() {
		
		List<Integer> list = new ArrayList<Integer>(); 
		
		// 70091070 break point....
		
		for(int i = 0; i < Integer.MAX_VALUE; i++) {
			System.out.println("i : "+i);  // 2147483647
			list.add(i);
		}
	}
}
