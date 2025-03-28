package Timus;

import java.util.Scanner;

public class timus2001 {
    public static void main(String[] args) {
        Scanner berry = new Scanner(System.in);
        int a1 = berry.nextInt();
        int b1 = berry.nextInt();
        int a2 = berry.nextInt();
        int b2 = berry.nextInt();
        int a3 = berry.nextInt();
        int b3 = berry.nextInt();

        int berries2 = b1 - b2;
        int berries1 = b3 - berries2 - b2;

        System.out.println(berries1 + " " + berries2);

    }
}
