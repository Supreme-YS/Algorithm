package Daily;

import java.io.*;

public class P2522 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {

            for (int j = 1; j < N - i; j++) {
                bw.write(" ");
            }

            for (int k = 0; k < i + 1; k++) {
                bw.write("*");
            }
            bw.newLine();
        }

        for (int j = 0; j < N; j++) {
            for (int l = 0; l < j + 1; l++) {
                bw.write(" ");
            }
            for (int k = 1; k < N - j; k++) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
