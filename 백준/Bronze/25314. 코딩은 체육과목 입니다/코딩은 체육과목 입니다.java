import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int longCount = count / 4;

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < longCount; i++) {
            result.append("long ");
        }
        
        System.out.println(result + "int");

    }
}