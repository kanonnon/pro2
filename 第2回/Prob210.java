public class Prob210 {
    public static void main(String[] args) {
        MyCircle c = new MyCircle();
        c.setCircle(20, 23, 4);
        double area = c.computeArea();
        double circumference = c.computeCircumference();
        System.out.println("The area of the circle is " + area + " and the circumference is " + circumference);
    }
}
