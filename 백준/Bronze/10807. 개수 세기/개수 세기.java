import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int v, i;
		int count = 0;

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] arr = new int[N];
		
		for (i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		v = scanner.nextInt();
		
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == v) {
				count++;
			}
		}
		
		System.out.println(count);
		scanner.close();
	}
}