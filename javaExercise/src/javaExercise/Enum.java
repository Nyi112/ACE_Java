package javaExercise;

//enum Level {
//	LOW, MEDIUM, HIGH
//}
//enum Season {
//	WINTER, SPRING, SUMMER, FALL
//}

enum Season1 {
	WINTER(5), SPRING(10), SUMMER(15), FALL(20);
	
	int value;
	Season1(int value) {
		this.value = value;
	}
}


public class Enum {
	 public static void main(String[] args) {
		 for (Season1 s:Season1.values()) {
			 System.out.println(s + " " + s.value);
		 }
		 
		 
//		 Level myVar = Level.MEDIUM;
//		 Season s = Season.WINTER;
//		 System.out.println(s);
//		 for (Season ss:Season.values()) {
//			 System.out.println(ss);
//		 }
	 }
}
