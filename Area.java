public class Area {
    public static void main(String[] args) {
        Area2 a = new Area2();
        a.display(12, 5);

    }
}

class Area2 {
    void display(int l, int b) {

        int area = l * b;
        System.out.println(area);
    }
}