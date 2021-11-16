/* 11721 */
package Daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
            if (i % 10 == 9){
                System.out.println();
            }
        }
    }
}
