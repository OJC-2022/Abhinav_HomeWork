class EvenNo {
    public static void main(String[] args) {
        EvenNo2.display(10);
    }
}

class EvenNo2 {
    static void display(int a) {
        // int a = 10;
        if (a % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }
    }
}