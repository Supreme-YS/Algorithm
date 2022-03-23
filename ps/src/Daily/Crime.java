package Daily;

import java.util.Arrays;

public class Crime {
    String[] area = { "부산", "서울", "제주도" };
    int[] count = { 595, 236, 1945 };
    int[] population = { 229861, 81786, 199265 };
    int[] ranking = { 1, 2, 3 };

    int result;


    int[] average() {
        int[] primeRate = new int[3];
        for (int i = 0; i < area.length; i++) {
            primeRate[i] = population[i] / count[i];
        }
        return primeRate;
    }

    void rank(int[] arr) {
//        return Arrays.sort(arr);
    }

    public static void main(String[] args) {
        Crime crime = new Crime();
        int[] average = crime.average();
        System.out.println(crime.rank(average));
    }
}
