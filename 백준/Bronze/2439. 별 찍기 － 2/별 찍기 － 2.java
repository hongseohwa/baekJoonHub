import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int spaceCount = n - 1;
		int starCount = 1;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= spaceCount; j++) {
				System.out.print(' ');
			}
			for (int z = 1; z <= starCount; z++) {
				System.out.print("*");
			}
			System.out.println();
			spaceCount -= 1;
			starCount += 1;
		}
	}
}