package Daily;

import java.util.Scanner;

public class SetAlarm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hour  = input.nextInt();
        int minute = input.nextInt();

        if ( ((minute-45) < 0) && (hour > 0) ) {
            hour = hour-1;
            minute = 60 + (minute-45);
            System.out.print(hour);
            System.out.print(" ");
            System.out.println(minute);
        } else if ( ((minute-45) < 0) && (hour < 0) ) {
            hour = 23;
            minute = 60 + (minute-45);
            System.out.print(hour);
            System.out.print(" ");
            System.out.println(minute);
        } else if ( (hour == 0) && ((minute-45) < 0) ) {
            hour = 23;
            minute = 60 + (minute-45);
            System.out.print(hour);
            System.out.print(" ");
            System.out.println(minute);
        } else {
            minute = minute - 45;
            System.out.print(hour);
            System.out.print(" ");
            System.out.println(minute);
        }
    }
}
