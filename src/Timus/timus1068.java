package Timus;

import java.util.Scanner;

public class timus1068 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int total = 0;
        int first = Math.min(number, 1);
        int last = Math.max(number, 1);
        for (int current = first; current <= last; current++) {
            total += current;
        }

        System.out.println(total);
        input.close();
    }
}

