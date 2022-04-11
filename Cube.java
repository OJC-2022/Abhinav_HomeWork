class Cube {
    public static void main(String[] args) {
        cube2 c = new cube2();
        c.display(4);
    }
}

class cube2 {
    void display(int a) {
        a = a * a * a;
        System.out.println(a);
    }
}
