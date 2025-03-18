package javaExercise;

import java.util.Scanner;
public class EnumSwitch {
	enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Day: ");
		String input = sc.next().toUpperCase();
		
		
		Day day;
		try {
			day = Day.valueOf(input);
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid day entered.");
			sc.close();
			return;
		}
		
//		Day day = Day.MONDAY;
		switch (day) {
		case SUNDAY:
			System.out.println("Sunday is best.");
			break;
		case SATURDAY:
			System.out.println("SATURDAY is best.");
			break;
		case MONDAY:
			System.out.println("Monday is bad.");
			break;
			default:
				System.out.println("Other day are not bad.");
		}
		sc.close();
	}
}
