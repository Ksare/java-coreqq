package Timus;

import java.util.Scanner;

public class timus1264 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int result = n * (m + 1);

        System.out.println(result);
    }
}

