package Daily;

import java.util.Scanner;

public class UntilHap {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int hap = 0;
        int cnt = input.nextInt();

        for (int i=1; i <= cnt; i++){
            hap = hap + i;
        }
        System.out.println(hap);
    }
}
