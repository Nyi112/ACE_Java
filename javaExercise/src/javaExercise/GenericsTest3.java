package javaExercise;

public class GenericsTest3 {
	public static<T extends Number> void sum(T num1, T num2) {
		double result = num1.doubleValue() + num2.doubleValue();
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		sum(4,3);
		sum(2.8, 5);
		sum(7.9, 6.9);
	}
}
