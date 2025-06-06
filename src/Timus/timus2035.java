package Timus;

import java.util.Scanner;

public class timus2035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long X = scanner.nextLong();
        long Y = scanner.nextLong();
        long C = scanner.nextLong();

        if (C > X + Y) {
            System.out.println("Impossible");
            return;
        }

        long A = Math.min(X, C);
        long B = C - A;

        if (B >= 0 && B <= Y) {
            System.out.println(A + " " + B);
        } else {
            System.out.println("Impossible");
        }
    }
}

