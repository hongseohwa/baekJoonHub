import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int scannerking = scanner.nextInt();
		int scannerqueen = scanner.nextInt();
		int scannerrook = scanner.nextInt();
		int scannerbishop = scanner.nextInt();
		int scannerknight = scanner.nextInt();
		int scannerpawn = scanner.nextInt();
		
		int king = 1 - scannerking;
		int queen = 1 - scannerqueen;
		int rook = 2 - scannerrook;
		int bishop = 2 - scannerbishop;
		int knight = 2 - scannerknight;
		int pawn = 8 - scannerpawn;
		
		System.out.println(king + " " + queen + " " + rook + " " + bishop + " " + knight + " " + pawn);
	}
}