public class ReverseString {
    public static void main(String[] args) {
        int n = 10; // number of fibonacci numbers to print
        int a = 0;
        int b = 1;
        int c;

        System.out.print(a + " " + b + " ");

        for (int i = 0; i < n - 2; i++) {
            c = a + b;
            a = b;
            b = c;

            System.out.print(c + " ");
        }
    }
}
