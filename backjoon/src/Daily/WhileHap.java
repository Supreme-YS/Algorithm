package Daily;

import java.util.Scanner;

public class WhileHap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(input.hasNextInt()) {
            int a = input.nextInt();
            int b = input.nextInt();
            if (a == 0 && b == 0){
                break;
            } else {
                System.out.println(a+b);
            }
        }
    }
}
