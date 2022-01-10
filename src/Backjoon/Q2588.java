package Backjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();

        while(b > 0) {
            nums.add(b % 10);
            b = b/10;
        }

        System.out.println(nums.get(0)*a);
        System.out.println(nums.get(1)*a);
        System.out.println(nums.get(2)*a);
        System.out.println((nums.get(0)*a) + (nums.get(1)*a*10) + (nums.get(2)*a*100));
    }
}
