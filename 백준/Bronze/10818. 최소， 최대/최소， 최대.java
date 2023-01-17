import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[scanner.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		for(int num : arr) {
			max = Math.max(max, num);
			min = Math.min(min, num);
		}
		System.out.println(min + " " + max);
	}
}