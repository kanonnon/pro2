public class Prob28 {
    public static void main(String[] args) {
        Turtle t = new Turtle();
        t.move(200, 200);
        t.penDown();
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 4; j++) {
                t.go(i * 10);
                t.rotate(90);
            }
        }
        t.rotate(-90);
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 4; j++) {
                t.go(i * 10);
                t.rotate(270);
            }
        }
    }
}
