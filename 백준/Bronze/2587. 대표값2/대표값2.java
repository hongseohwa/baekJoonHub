import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[5];
		int sum = 0, avg = 0, middleNum;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
		}
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		avg = sum / 5;
		Arrays.sort(num);
		middleNum = num[2];
		
		System.out.println(avg);
		System.out.println(middleNum);
	}
}