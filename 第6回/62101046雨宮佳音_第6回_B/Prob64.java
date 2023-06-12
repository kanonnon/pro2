public class Prob64 {
    public static void main(String[] args) {
        int result = 1;
        for (int i = 0; i < args.length; i++) {
            result *= Integer.valueOf(args[i]);
        }
        System.out.println(result);
    }
}
