public class MyCircle {
    MyPoint center;
    int radius;

    void setCircle(int x, int y, int r) {
        center = new MyPoint();
        center.x = x;
        center.y = y;
        radius = r;
    }

    int computeDiameter() {
        return radius * 2;
    }

    double computeArea() {
        return radius * radius * Math.PI;
    }

    double computeCircumference() {
        return computeDiameter() * Math.PI;
    }
}
