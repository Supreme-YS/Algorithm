/* 2751번 정렬하기 */
/* 시간초과에 유의해서 다시 풀어보자 */

package Step12;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

import static java.lang.String.valueOf;


public class Sorting2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for (int value : list) {
            bw.append(valueOf(value)).append("\n");
        }
        bw.flush();
        bw.close();
    }
}
