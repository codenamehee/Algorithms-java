package Backjoon;

import java.util.Scanner;

public class Q2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = Integer.parseInt(sc.next());
        int minute = Integer.parseInt(sc.next());

        // minute > 45 && minute <= 59 이면 hour = hour, minute = minute - 45
        // minute >= 0 && minute <= 45 이고
        // hour == 0 이면 hour = 11, minute = 60 - (45-minute) hour > 0 이면 hour = hour-1, minute

        if (minute >= 45 && minute <=59) {
//            hour = hour;
            minute = minute - 45;
            System.out.println(hour + " " + minute);
        } else if (minute >=0 && minute < 45) {
            if (hour == 0) {
                hour = 23;
                minute = 60 - (45 - minute);
                System.out.println(hour + " " + minute);
            } else if (hour > 0) {
                hour = hour - 1;
                minute = 60 - (45 - minute);
                System.out.println(hour + " " + minute);
            }
        }
    }
}
