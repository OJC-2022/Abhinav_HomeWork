public class PrimeNo {
    public static void main(String[] args) {
        int a = 11, count = 0;
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