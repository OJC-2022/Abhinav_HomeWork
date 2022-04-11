public class EvenInLoop {
    public static void main(String[] args) {
        Even2 e = new Even2();
        e.display();
    }
}

class Even2 {
    void display() {
        int i = 10;
        while (i >= 2) {
            System.out.println(i);
            i = i - 2;
        }
    }
}
