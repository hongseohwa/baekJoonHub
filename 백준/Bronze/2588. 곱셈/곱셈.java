import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int n = 0;
		
		int f = a * (b % 10);
		System.out.println(f);
		b /= 10;
		int s = a * (b % 10);
		System.out.println(s);
		b /= 10;
		int c = a * b;
		System.out.println(c);
		n = f + (s * 10) + (c * 100);
		System.out.println(n);
	}
}