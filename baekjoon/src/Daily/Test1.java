package Daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String output = "";
        String result = "";
        int tmp;

        // 전부 소문자로 통일
        for (int i = 0; i < s.length(); i++) {

            tmp = (int)s.charAt(i);

            if( (65 <= tmp) && ( tmp <= 90) ) {
                output += (char)(tmp + 32);
            } else {
                output += (char)tmp;
            }
        }

        int[] counting = new int[26];

        for (int j = 0; j < output.length(); j++) {
            tmp = (int)output.charAt(j)-97;
            counting[tmp]++;
        }

        int max = -1;
        char ch = '0';

        for (int i = 0; i < 26; i++) {
            if (counting[i] > max) {
                max = counting[i];
                ch = (char) (i + 97); // 대문자로 출력해야하므로 65를 더해준다.
            } else if (counting[i] == max) {
                ch = '?';
            }
        }
        System.out.println();
    }
}
