public class Prob38 {
    public static void main(String[] args) {
        MyPointNew p = new MyPointNew();
        MyPointNew q = new MyPointNew();
        p.setPoint(20, 23);
        q.setPoint(4, 21);
        System.out.println(p.getDistanceFrom(q));
    }
}
