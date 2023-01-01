import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		int s = 0;
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for (int i = 0; i <= n; i++) {
			s += i;
		}
		System.out.println(s);
	}
}