import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int num = 0;
		int a = n / 10; // 2
		int b = n % 10; // 6
		int count = 1;
		int num1 = 0;
		num = a + b; // 8
		num %= 10; // 8
		
		while(true) {
			num1 = b + num; // 6 = 4 + 2
			b = num; // b = 2
			num = num1 % 10; // num = 6
			count++; // 4
			if (n == (b * 10) + num) {
				if (n == 0) {
					count -= 1;
				}
				break;
			}
		}
		System.out.println(count);
	}
}