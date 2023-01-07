import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int m = scanner.nextInt();
		
		if (m >= 45) {
			System.out.println(h + " " + (m - 45));
		} else if (h == 0) {
			System.out.println((h + 24 - 1) + " " + (m + 60 - 45));
		} else {
			System.out.println((h - 1) + " " + (m + 60 - 45));
		}
	}
}