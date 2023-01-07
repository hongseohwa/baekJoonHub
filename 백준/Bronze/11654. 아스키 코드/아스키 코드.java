import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		char ch = ' ';
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		if ('0' <= ch && ch <= '9') {
			System.out.println((int)ch);
		} else if ('a' <= ch && ch <= 'z') {
			System.out.println((int)ch);
		} else if ('A' <= ch && ch <= 'Z') {
			System.out.println((int)ch);
		} else {
			System.out.println();
		}
	}
}