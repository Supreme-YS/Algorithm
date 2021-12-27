package Daily;

import java.util.Scanner;

public class MultiplyByThree {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int temp;

        String text = Integer.toString(b);

        for(int i=text.length(); i>0; i--){
            temp = Integer.parseInt(text.substring(i-1, i)); // substring(begin index, end index)
            System.out.println(a * temp);
        }
        System.out.println(a*b);
    }
}
