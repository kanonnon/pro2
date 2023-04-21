public class ComplexNumber {
    int a, b;
    void print() {
        System.out.println(a + " + " + b + "i");
    }
    double abs() {
        return Math.sqrt(a * a + b * b);
    }
}
