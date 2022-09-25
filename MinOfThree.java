public class MinOfThree {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;

        System.out.print("Smallest number out of the three numbers is: ");
        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < c && b < a) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
