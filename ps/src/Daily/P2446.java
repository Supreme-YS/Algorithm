package Daily;

import java.io.*;

public class P2446 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {

            for (int k = 1; k < i + 1; k++) {
                bw.write(" ");
            }

            for (int j = N; j > i; j--) {
                bw.write("*");
            }

            for (int l = N-1; l > i; l--){
                bw.write("*");
            }

//            for (int k = 1; k < i + 1; k++) {
//                bw.write(" ");
//            }
            bw.newLine();
        }

        for (int j = 1; j < N; j++) {
            for (int k = 1 ; k < N-j; k++) {
                bw.write(" ");
            }

            for (int l = 1; l < j+2; l++) {
                bw.write("*");
            }

            for (int n = 1; n < j+1; n++) {
                bw.write("*");
            }

//            for (int m = 1; m < N-j; m++ ) {
//                bw.write(" ");
//            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
