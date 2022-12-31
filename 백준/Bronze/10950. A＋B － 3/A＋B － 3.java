import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		int i = 0;
		while(i < t) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			i++;
			
			System.out.println(a + b);
		}
	}
}