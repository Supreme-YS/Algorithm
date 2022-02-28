package Daily;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(192, 162));
    }

    public static int gcd(int x, int y) {
        if (x % y == 0) {
            return y;
        } else {
            return gcd(y, x % y);
        }
    }
}
