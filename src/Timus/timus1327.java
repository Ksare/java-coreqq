package Timus;

import java.util.Scanner;
public class timus1327 {
    public static void main(String[] parameters) {
        Scanner inputReader = new Scanner(System.in);
        int startValue = inputReader.nextInt();
        int endValue = inputReader.nextInt();

        int oddCount = calculateOddNumbers(endValue) - calculateOddNumbers(startValue - 1);
        System.out.println(oddCount);
    }

    static int calculateOddNumbers(int limit) {
        if (limit < 1) return 0;
        return (limit + 1) / 2;
    }
}

