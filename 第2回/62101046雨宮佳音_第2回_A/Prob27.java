public class Prob27 {
    public static void main(String[] args) {
        ComplexNumber p = new ComplexNumber();
        ComplexNumber q = new ComplexNumber();
        p.a = 20;
        p.b = 23;
        q.a = 4;
        q.b = 14;
        p.print();
        System.out.println("絶対値は" + p.abs() + "です");
        q.print();
        System.out.println("絶対値は" + q.abs() + "です");
    }
}
