package Timus;

import java.util.Scanner;

public class timus1877 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int firstValue = reader.nextInt();
        int secondValue = reader.nextInt();

        if(firstValue % 2 == 0 || secondValue % 2 != 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

