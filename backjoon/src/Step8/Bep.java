package Step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bep {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int fix_price = Integer.parseInt(st.nextToken());
        int var_price = Integer.parseInt(st.nextToken());
        int pro_price = Integer.parseInt(st.nextToken());

        if (pro_price <= var_price) {
            System.out.println("-1");
        }

        else {
            System.out.println((fix_price/(pro_price-var_price))+1);
        }
    }
}
