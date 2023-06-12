public class Sum {
    static int getSum(int x, int y) {
        System.out.println("A: " + (x + y));
        return x + y;
    }

    static int getSum(int x, int y, int z) {
        System.out.println("B: " + (x + y + z));
        return x + y + z;
    }

    static double getSum(double x, double y) {
        System.out.println("C: " + (x + y));
        return x + y;
    }
    
    public static void main(String[] args) {
        getSum(23, 4); 
        getSum(23, 4, 28); 
        getSum(2.3, 4.28);
        getSum(getSum(20, 2.3), getSum(4, 28));
    }
}
