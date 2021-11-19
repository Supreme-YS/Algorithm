package Daily;

import java.io.*;

public class P2445 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < i + 1; j++) {
                bw.write("*");
            }

            for (int k = 0; k < N - i - 1; k++) {
                bw.write(" ");
            }

            for (int l = 0; l < N - i - 1; l++) {
                bw.write(" ");
            }

            for (int m = 0; m < i + 1; m++) {
                bw.write("*");
            }
            bw.newLine();
        }

        for (int j = 0; j < N-1; j++) {

            for (int k = N-1; k > j; k--) {
                bw.write("*");
            }
            for (int l = 0; l < j+1; l++) {
                bw.write(" ");
            }

            for (int l = 0; l < j+1; l++) {
                bw.write(" ");
            }

            for (int m = N-1; m > j; m--) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
