public class fifth {
    public static void main(String[] args) {
        int n = 7;

        System.out.println("n n^2 n^3 n^4");

        for (int number = 1; number <= n; number++) {
            for (int exponent = 1; exponent <= 4; exponent++) {
                System.out.print((int) Math.pow(number, exponent) + " ");
            }
            System.out.println();
        }
    }
}
