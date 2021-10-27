package Step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ImproveRemainder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] remainder = new int[10];
        boolean bl;
        int cnt = 0;

        for(int i=0; i<remainder.length; i++){
            remainder[i] = Integer.parseInt(br.readLine()) % 42; // BufferedReader는 String형이기 때문에 Integer Parsing이 필요하다.
        }

        for(int j=0; j<10; j++){
            bl = false;
            for (int k=j+1; k<remainder.length; k++) {
                if( remainder[j] == remainder[k] ){
                    bl = true;
                    break;
                }
            }
            if ( bl == false ){
                cnt ++;
            }
        }
        System.out.println(cnt);
    }
}
