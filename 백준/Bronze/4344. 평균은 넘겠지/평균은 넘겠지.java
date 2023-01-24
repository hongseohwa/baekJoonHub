import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		
		int c = scanner.nextInt();
		
		for(int i = 0; i < c; i++) {
			int[] arr = new int[scanner.nextInt()];
			double sum = 0;
			for(int j = 0; j < arr.length; j++) {
				arr[j] = scanner.nextInt();
				sum += arr[j];
			}
			double avg = sum / arr.length;
			double count = 0;
			for(int z = 0; z < arr.length; z++) {
				if (avg < arr[z]) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (count / arr.length) * 100);
		}
	}
}