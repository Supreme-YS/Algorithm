package Daily;

import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int value = (input.nextInt() * input.nextInt() * input.nextInt());
        String str = Integer.toString(value);
        input.close();

        for (int i = 0; i < 10; i++) {
            int cnt = 0;
            for (int j = 0; j < str.length(); j++){
                if((str.charAt(j)-'0') == i){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
