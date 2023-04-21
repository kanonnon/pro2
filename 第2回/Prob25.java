public class Prob25 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint();
        MyPoint q = new MyPoint();
        p.x = 20;
        p.y = 23;
        q.x = 4;
        q.y = 14;
        System.out.println("点Pと原点との距離は" + p.getDistance() + "です");
        System.out.println("点Qと原点との距離は" + q.getDistance() + "です");
    }
}
