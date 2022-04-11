public class Divisible {
    public static void main(String[] args) {
        divisible2 d = new divisible2();
        d.display(41, 7);
    }
}

class divisible2 {
    void display(int a, int b) {

        if (a % b == 0) {
            System.out.println("yes, divisible");
        } else {
            System.out.println("no");
        }
    }
}
