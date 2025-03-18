package javaExercise;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericContainer<T> {
	private T obj;
	
	public GenericContainer(T obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
//		return "GenericContainer [obj=" + obj + "]";
		return "GenericContainer: " + obj.toString();
	}
	
	public static void main(String[] args) {
		GenericContainer<String> stringContainer = new GenericContainer<>("Hello, World");
		System.out.println(stringContainer);
		
		GenericContainer<Integer> integerContainer = new GenericContainer<>(42);
		System.out.println(integerContainer);
	}
	
}
