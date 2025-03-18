package javaExercise;
import java.util.*;
public class IteratorTest {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			if (itr.next() % 2 == 0) {
				itr.remove();
			}
			
		}
		System.out.println(list);
//		list.add("Kathy");
//		list.add("Doll");
//		list.add("Chris");
//		list.add("Suzy");
//		
//		System.out.println(list);
//		
//		Iterator itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
	}
}

