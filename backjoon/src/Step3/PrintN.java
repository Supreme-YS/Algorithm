package Step3;

import java.util.Scanner;

public class PrintN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();

        for(int i=0; i < count; i++) {
            System.out.println(i+1);
        }
    }
}
