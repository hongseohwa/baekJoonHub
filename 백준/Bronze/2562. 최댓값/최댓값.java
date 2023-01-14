import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[9];
		int[] arr2 = new int[9];
		int count = 0;
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.arraycopy(arr, 0, arr2, 0, 9);
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			if (arr[0] == arr2[i]) {
				count = i + 1;
			}
		}
		System.out.println(arr[0]);
		System.out.println(count);
	}
}