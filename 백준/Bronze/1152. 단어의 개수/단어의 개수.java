import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        if(string.trim().isEmpty()) {
            System.out.println(0);
        } else {
            int count = string.split(" ").length;

            if(string.startsWith(" ")) {
                count = count - 1 ;
            }  
            
            System.out.println(count);
        }
    }
}