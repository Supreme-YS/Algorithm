/* 11720 */
package Weekly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int sum = 0;

        for (int i=0; i<str.length(); i++) {
            sum = sum + (int)str.charAt(i)-48;
        }
        System.out.println(sum);
    }
}
