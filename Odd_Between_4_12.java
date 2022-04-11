import java.util.Scanner;

public class Odd_Between_4_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any no :- ");
        int n = scan.nextInt();
        n = n + 1;
        while (n <= 12) {
            System.out.println(n);
            n = n + 2;
        }
    }
}
