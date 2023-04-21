public class Prob23 {
    public static void main(String[] args) {
        Turtle t1 = new Turtle();
        Turtle t2 = new Turtle();

        t1.move(10, 200);
        t1.penDown();
        for (int i = 0; i < 4; i++) {
            t1.go(40);
            t1.rotate(90);
        }
        t2.move(80, 200);
        t2.penDown();
        for (int j = 0; j < 5; j++) {
            t2.go(40);
            t2.rotate(72);
        }
    }
}
