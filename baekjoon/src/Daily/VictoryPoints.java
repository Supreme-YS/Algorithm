import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class VictoryPoints {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int games = Integer.parseInt(br.readLine());

        String[] scores = new String[games];

        for (int i = 0; i < games; i++) {
            scores[i] = br.readLine();
        }

        System.out.println(getVictoryPoints(scores));
    }

    public static int getVictoryPoints(String[] scores) {

        int a, b, result = 0;
        for (int i = 0; i < scores.length; i++) {
            a = Integer.parseInt(scores[i].split(":")[0]);
            b = Integer.parseInt(scores[i].split(":")[1]);

            if (a > b) {
                result = result + 3;
            } else if (a == b) {
                result = result + 1;
            } else {
                result = result + 0;
            }
        }
        return result;
    }
}
