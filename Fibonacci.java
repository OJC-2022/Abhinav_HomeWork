import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Fibo fibo = new Fibo();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number upto which move -");
        for (int k = 1; k <= 10; k++) {
            Fibo.display(scan.nextInt());
            System.out.println();
            System.out.print("Enter next number upto which move -");

        }
    }
}

class Fibo {
    public static void display(int a) {

        // for (int k = 1; k < 100; k++) {
        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter number upto which move -");
        // int a = scan.nextInt();
        // int a = 10;

        int temp;
        int b = 1;
        int b1 = 0;
        for (int i = 1; i <= a; i++) {
            b = b1 + b;
            temp = b1;
            b1 = b;
            b = temp;
            System.out.print(b1 + " ");
        }

    }

}
