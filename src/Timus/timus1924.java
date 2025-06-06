package Timus;

import java.util.Scanner;

public class timus1924 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n % 4 == 1 || n % 4 == 2) {
            System.out.println("grimy");
        } else {
            System.out.println("black");
        }
    }
}
