import java.util.Scanner;

public class OddNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no:- ");
        int n = scan.nextInt();
        Gaya gaya = new Gaya();
        gaya.manpur(n);
    }
}

class Gaya {
    void manpur(int n) {

        // int n = 7;
        n = n * 2;
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i % 2 != 0)
                System.out.println(i);
        }
    }
}