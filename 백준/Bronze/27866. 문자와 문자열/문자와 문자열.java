import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        int count = sc.nextInt();

        System.out.println(string.charAt(count-1));
    }
}