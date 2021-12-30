package Daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hose {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int max = Math.max(a,b);

        if (max == b) {
            System.out.println(hose(b, a));
        } else {
            System.out.println(hose(a, b));
        }
    }
    public static int hose(int a, int b) {
        int remain = a % b;

        if (remain == 0) {
            return b;
        }
        return hose(b, remain);
    }
}
