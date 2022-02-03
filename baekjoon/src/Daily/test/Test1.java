package Daily.test;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {


        String[] str = {"POOOO", "OXXOX", "OOXOX", "OOXOX"};

        System.out.println(str[1].length());
        String[][] map = new String[4][4];
        int[][] copyMap = new int[4][4];

        for (int i = 0; i < 4; i++) {
            String[] strArray = str[i].split("");

            for (int j = 0; j < 4; j++) {
                if (strArray[j].equals('P'){
                    st
                }
                map[i][j] = strArray[j];
            }
            System.out.println(Arrays.toString(map[i]));
        }
    }
}

class Solution {
    public int solution(int[] arr) {
        int answer = -1;
        return answer;
    }
}