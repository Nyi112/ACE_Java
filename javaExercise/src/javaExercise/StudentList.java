package javaExercise;
import java.util.*;

import lombok.Getter;

@Getter

class Student {
	private String id;
	private String name;
	private int age;
	
	public Student(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}


public class StudentList {
	public static void main(String[] args) {
		
		//create five student objects and add them to an ArrayList
		List<Student> studentArrayList = new ArrayList<>();
		studentArrayList.add(new Student("S-001", "Alice", 18));
		studentArrayList.add(new Student("S-002", "Bob", 22));
		studentArrayList.add(new Student("S003", "Charlie", 17));
        studentArrayList.add(new Student("S004", "David", 19));
        studentArrayList.add(new Student("S005", "Eve", 21));
        
        //student under age 20 in ArrayList
        
        System.out.println("Students in ArrayList under 20: ");
        
        for (Student student : studentArrayList) {
        	if (student.getAge() < 20) {
        		System.out.println(student);
        	}
        }
        
        //Create five student objects and add them to a LinkedList
        
        List<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(new Student("S-101", "Frank", 23));
        studentLinkedList.add(new Student("S102", "Grace", 24));
        studentLinkedList.add(new Student("S103", "Henry", 21));
        studentLinkedList.add(new Student("S104", "Ivy", 25));
        studentLinkedList.add(new Student("S105", "Jack", 19));
        
      //student over age 20 in LinkedList
        System.out.println("\nStudents over age 20 in LinkedList: ");
        
        for(Student student : studentLinkedList) {
        	if (student.getAge() > 20) {
        		System.out.println(student);
        	}
        }
        
	}
}
