import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a, b;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			if (a == 0 && b == 0) {
				break;
			} else {
				System.out.println(a + b);
			}
		}
	}
}