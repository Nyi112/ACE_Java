package javaExercise;
import java.util.*;
public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList cars = new ArrayList();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add(2);
		cars.add(4.4);
		System.out.println(cars);
		
		cars.add(new Employee());
		
		System.out.println(cars.get(2));
		
		int number = (int) cars.get(4);
		double d = (double) cars.get(5);
		System.out.println(number);
		System.out.println(d);
		
		cars.add(0, "Mercedes");
		System.out.println(cars);
		System.out.println(cars.size());
	}
}
