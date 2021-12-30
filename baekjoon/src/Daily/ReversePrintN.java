package Daily;

import java.util.Scanner;

public class ReversePrintN {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          int cnt = input.nextInt();

          for(int i = cnt; i > 0; i--){
               System.out.println(i);
          }
     }
}
