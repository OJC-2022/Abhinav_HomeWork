public class OddInLoop {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.action();
    }
}

class Hero {
    void action() {
        int i = 1, n = 7 * 2;
        while (i <= n) {
            System.out.println(i);
            i = i + 2;
        }
    }
}
