public class Prob24 {
    public static void main(String[] args) {
        Turtle t = new Turtle();
        t.move(80, 200);
        t.penDown();
        for (int i = 0; i < 12; i++) {
            switch (i % 4) {
                case 0:
                    t.setColor(java.awt.Color.blue);
                    break;
                case 1:
                    t.setColor(java.awt.Color.green);
                    break;
                case 2:
                    t.setColor(java.awt.Color.yellow);
                    break;
                case 3:
                    t.setColor(java.awt.Color.red);
                    break;
            }
            t.go(40);
            t.rotate(30);
        }
    }
}
