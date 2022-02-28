package Daily;

import java.util.Arrays;

public class Testt {
    public static void main(String[] args) {
        // 0 ~ 9 10개
        boolean[] light = new boolean[7];

        int[][] groups = new int[3][2];

        //3
        System.out.println(groups.length);

        groups[0][0] = 6;
        groups[0][1] = 7;
        groups[1][0] = 1;
        groups[1][1] = 4;
        groups[2][0] = 2;
        groups[2][1] = 4;

        for (int[] group : groups) {
            System.out.println("group.length:" + group.length);
            for (int j = 0; j < group.length; j++) { // 두 번 돈다


                for (int k = group[j]; k < group[1]; k++) {
                    light[group[k]-1] = true;
                }
            }
        }
    }
}
