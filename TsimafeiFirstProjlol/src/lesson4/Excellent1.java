package lesson4;

public class Excellent1 {

    public static void main(String[] args) {

        int x;
        int y;
        int z;
        Excellent1 ex = new Excellent1();
        ex.check(1, 0, 0);
    }

    private void check(int x, int y, int z) {

        if (x > 0 && y > 0 && z > 0) {
            System.out.println("Excellent");
        } else if (x > 0 && y > 0 || x > 0 && z > 0 || y > 0 && z > 0) {
            System.out.println("good");
        } else if (x > 0 || y > 0 || z > 0) {
            System.out.println("fine");
        } else if (x == 0 && y == 0 && z == 0) {
            System.out.println("bad");
        }
    }


}

