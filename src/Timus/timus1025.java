package Timus;

import java.util.Arrays;
import java.util.Scanner;

public class timus1025 {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        int partyCount = inputReader.nextInt();

        int[] factionSizes = new int[partyCount];
        for (int idx = 0; idx < partyCount; idx++) {
            factionSizes[idx] = inputReader.nextInt();
        }

        int supportersNeeded = calculateMinSupporters(partyCount, factionSizes);

        System.out.println(supportersNeeded);
    }

    public static int calculateMinSupporters(int totalParties, int[] partyMembers) {
        Arrays.sort(partyMembers);

        int majorityThreshold = (totalParties / 2) + 1;

        int totalSupporters = 0;
        for (int i = 0; i < majorityThreshold; i++) {
            totalSupporters += (partyMembers[i] / 2) + 1;
        }

        return totalSupporters;
    }
}

