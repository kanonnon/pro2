public class Prob17 {
    public static void main(String[] args) {
        int i = 3202, j = 704;
        int k;
        System.out.print(i + "と" + j + "の最大公約数は");
        do {
            k = i % j;
            i = j;
            j = k;
        } while (k != 0);
        System.out.println(i + "です");
    }
}
