public class OddNo {
    public static void main(String[] args) {
        int n = 7;
        n = n * 2;
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i % 2 != 0)
                System.out.println(i);
        }
    }
}
