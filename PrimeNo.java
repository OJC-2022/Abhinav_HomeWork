import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter any no to check prime: ");
            int checkNo = scan.nextInt();
            Abhi.show(checkNo);
        }
    }
}

class Abhi {
    static void show(int a) {
        // int a = 11;
        int count = 0;
        if (a > 1) {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    count = count + 1;
                }
            }
            if (count == 0) {
                System.out.println(a + " is prime");
            } else {
                System.out.println(a + " is not prime");
            }
        } else {
            System.out.println(a + " is not prime");
        }
    }
}