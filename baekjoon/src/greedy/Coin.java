package greedy;

public class Coin {
    public static void main(String[] args) {
        int n = 1260;
        int cnt = 0;

        int[] coinTypes = {500, 100, 50, 10};

        for (int i = 0; i < coinTypes.length; i++) {
            cnt = cnt + (n / coinTypes[i]);
            n = n % coinTypes[i];
        }

        System.out.println(cnt);
    }
}
