public class CrossVertex extends Vertex {
    void draw(Turtle t) {
        t.penDown();
        for (int i = 0; i < 4; i++) {
            t.go(5);
            t.go(-5);
            t.rotate(90);
        }
    }
}
