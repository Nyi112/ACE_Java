package javaExercise;
import java.util.*;
class Animal {
	public String toString() {
		return "Animal";
	}
}

class Dog extends Animal{
	public String toString() {
		return "Dog";
	}
}

class Cat extends Animal{
	public String toString() {
		return "Cat";
}
}


public class GenericsTest4 {
	public static void main(String[] args) {
		List<Animal> list1 = new ArrayList<Animal>();
		list1.add(new Animal());
		list1.add(new Dog());
		list1.add(new Cat());
		print(list1);
		display(list1);
		
		List<Dog> list2=new ArrayList();
		list2.add(new Dog());
		print(list2);
		display(list2);
		
		List<Cat> list3=new ArrayList();
		list3.add(new Cat());
		print(list3);
		display(list3);
	}


public static void print(List<? extends Animal> list) {
	for (Object obj: list) {
		System.out.println(obj);
		
	}
}

public static void display(List<? extends Animal> list){
	for(Object obj: list)
		System.out.println(obj);
}
}
