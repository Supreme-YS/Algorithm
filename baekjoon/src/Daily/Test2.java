package Daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int tmp;
        int result = 0;

        int diff = 1;

        int[] counting = new int[26];

        for (int i = 0; i < str.length(); i++) {
            tmp = (int) str.charAt(i) - 97;
            counting[tmp]++;
        }

        for (int i = 0; i < counting.length; i++) {
            if (counting[i] == 1) {
                result += 1;
            }

            if (counting[i] == 1 && counting[i+1] == 1) {
                result += 1;
            }

            if ( counting[i] >= 1) {
                result += 1;
            }
        }

        System.out.println(result);
    }
}
