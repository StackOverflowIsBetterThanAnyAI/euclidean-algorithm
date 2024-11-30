public class Calculation {
    public static int calculateRemainder(int a, int b, int prev) {
        int c = a - a / b * b;
        if (c > 0) {
            return (calculateRemainder(b, c, c));
        }
        return prev;
    }
}
