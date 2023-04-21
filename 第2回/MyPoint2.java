public class MyPoint2 {
    int x, y;
    double getDistance() {
        return Math.sqrt(x * x + y * y);
    }
    void printCoord() {
        System.out.println("(" + x + ", " + y + ")");
    }
}
