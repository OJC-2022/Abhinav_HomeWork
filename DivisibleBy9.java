public class DivisibleBy9 {
    public static void main(String[] args) {
        Table9(4);
    }

    static void Table9(int n) {
        // int n = 4;
        for (int i = 1; i <= n; i++) {
            int b = i * 9;
            System.out.println(b);
        }
    }
}