package javaExercise;
import java.util.*;
public class MapTest {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(100, "Sue");
		map.put(101, "Mary");
		map.put(102, "Jones");
		
		System.out.println(map);
		
		for(Map.Entry<Integer, String> m: map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
