package javaExercise;

public class MyGen <T>{
	T obj;
	void add(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return obj;
	}
}
