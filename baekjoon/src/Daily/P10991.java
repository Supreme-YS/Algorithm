package Daily;

import java.io.*;

public class P10991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= N - i; j++) {
                bw.write(" ");
            }

            for (int k = 1; k <= 2*i-1; k++) {

                if (i % 2 == 1) {
                    bw.write("*");
                } else {
                    bw.write("-");
                }
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
