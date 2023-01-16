import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] arr = new String[t];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.next();
			int sum = 0, count = 0;
			for(int j = 0; j < arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					++count;
					sum += count; 
				} else {
					count = 0;
				}
			}
			System.out.println(sum);
		}
	}
}