public class HexVertex extends Vertex {
    void draw(Turtle t) {
        t.penDown();
        for (int i = 0; i < 6; i++) {
            t.go(10);
            t.rotate(60);
        }
    }
}
