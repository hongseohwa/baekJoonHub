import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			sum += a*b;
		}
		if (sum == x) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}