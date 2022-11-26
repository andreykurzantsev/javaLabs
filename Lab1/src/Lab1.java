public class Lab1 {
    public static void main(String[] args) {

        // Number = 0515
        // C2 = (515 % 2) = 1 (-)
        // C3 = (515 % 3) = 2 (2)
        // C5 = (515 % 5) = 0 (*)
        // C7 = (515 % 7) = 4 (char)

        final int n = 1, m = 2;
        final int a = -3, b = 1;
        final int dividorByZero = 2;
        double sum = 0;
        if (dividorByZero >= a && dividorByZero <= n) {
            System.out.println("Error: division by zero isn`t possible");
        } else {
            for (char i = (char) a; i <= n; i++) {
                for (char j = (char) b; j <= m; j++) {
                    sum += (double) (i * j) / (i - dividorByZero);
                }
            }
            System.out.println("Result: " + sum);
            System.out.println((int)(char)a);
        }

    }
}
