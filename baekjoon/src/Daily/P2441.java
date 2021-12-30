package Daily;

import java.io.*;

public class P2441 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i=0; i < n; i++) {

            for (int j=0; j<i; j++) {
                bw.write(" ");
            }

            for (int k=0; k < n-i; k++){
                bw.write("*");
            }

            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
