package javaExercise;
import java.util.Scanner;
public class CharacterCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a charcter");
		char ch = scanner.next().charAt(0);
		
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " is a capital letter");
		}
	}
}
