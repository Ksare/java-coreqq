package Timus;

import java.util.Scanner;

public class timus1005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numWeights = input.nextInt();
        int[] weightArray = new int[numWeights];
        int combinedWeight = 0;

        for (int idx = 0; idx < numWeights; idx++) {
            weightArray[idx] = input.nextInt();
            combinedWeight += weightArray[idx];
        }
        input.close();

        int smallestGap = Integer.MAX_VALUE;
        int combinations = 1 << numWeights;

        for (int combination = 0; combination < combinations; combination++) {
            int firstGroup = 0;
            for (int pos = 0; pos < numWeights; pos++) {
                if ((combination & (1 << pos)) != 0) {
                    firstGroup += weightArray[pos];
                }
            }
            int secondGroup = combinedWeight - firstGroup;
            smallestGap = Math.min(smallestGap, Math.abs(firstGroup - secondGroup));
        }

        System.out.println(smallestGap);
    }
}

