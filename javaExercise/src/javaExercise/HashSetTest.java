package javaExercise;
import java.util.*;
public class HashSetTest {
	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add("John");
		set.add("Marry");
		set.add("David");
		set.add("Smith");

		System.out.println(set);
		
		TreeSet tree = new TreeSet();
		tree.add("John");
		tree.add("Marry");
		tree.add("David");
		tree.add("Smith");
		System.out.println(tree);
	}
}
