import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int m = scanner.nextInt();
		int o_m = scanner.nextInt();
		
		int tm = m + o_m;
		
		if (tm >= 60) {
			if (h + (tm/60) >= 24) {
				System.out.println(((h + (tm / 60)) % 24) + " " + (tm % 60));
			} else {
				System.out.println((h + (tm / 60)) + " " + (tm % 60));
			}
		} else {
			System.out.println(h + " " + tm);
		}
	}
}