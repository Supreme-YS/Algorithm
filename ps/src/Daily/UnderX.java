package Daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnderX {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        int number = Integer.parseInt(br.readLine());

        int[] arr = new int[cnt];

        for (int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int j=0; j<arr.length; j++){
            if (arr[j] < number){
                System.out.print(arr[j]);
                System.out.print(" ");
            } else {
                continue;
            }
        }
    }
}
