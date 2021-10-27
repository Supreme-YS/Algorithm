package Step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RightPrintStars {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= cnt; i++) {
            for (int j =1; j <= cnt-i; j++) {
                System.out.print(" ");
            }

            for (int k=0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
