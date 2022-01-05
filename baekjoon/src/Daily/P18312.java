package Daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P18312 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int count = 0;

        for (int hour = 0; hour <= N; hour++) {
            for (int min = 0; min < 60; min++) {
                for (int sec = 0; sec < 60; sec++) {
                    String time = ((hour < 10) ? "0" + hour : "" + hour) +
                            ((min < 10) ? "0" + min : "" + min) +
                            ((sec < 10) ? "0" + sec : "" + sec);

                    if (time.contains("" + K)) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}

//        int hour = 0;
//        int minute = 0;
//        int second = 0;

//        for (int i=0; i < 3600 * N + 3595; i++) {
//            hour = i / 3600;
//            minute = (i % 3600) / 60;
//            second = (i % 3600) % 60;
//
//            if ( hour == K | minute == K | second == K) {
//                count ++;
//            }
//        }

