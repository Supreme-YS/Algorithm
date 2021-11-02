package Step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Oxquiz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("");

//        int tc = Integer.parseInt(br.readLine());
        int total = 0;

        br.close();

        for (String value : s) {
            if (value.equals('O')){
                System.out.println(value);
            }
        }
    }
}

