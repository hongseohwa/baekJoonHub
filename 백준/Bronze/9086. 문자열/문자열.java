import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        String[] strList = new String[count];

        for(int i = 0; i < count; i++) {
            strList[i] = sc.next();
        }

        for (String s : strList) {
            System.out.println(String.valueOf(s.charAt(0)) + String.valueOf(s.charAt(s.length() - 1)));
        }
    }
}