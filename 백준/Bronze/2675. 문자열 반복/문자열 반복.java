import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int r = 0;
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		String[] s = new String[t];
		String p;
		
		for(int i = 0; i < t; i++) {
			r = scanner.nextInt();
			s[i] = scanner.next();
			p = "";
			for(int j = 0; j < s[i].length(); j++) {
				for(int z = 0; z < r; z++) {
					p += s[i].charAt(j);
				}
			}
			System.out.println(p);
		}
		scanner.close();
	}
}