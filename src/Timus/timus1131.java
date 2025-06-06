package Timus;

import java.util.Scanner;

public class timus1131 {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        int totalComputers = inputReader.nextInt();
        int productionRate = inputReader.nextInt();

        int timeRequired = calculateProcessingTime(totalComputers, productionRate);

        System.out.println(timeRequired);
    }

    public static int calculateProcessingTime(int numComputers, int rate) {
        int exponentialTime = 0;
        int readyComputers = 1;

        // Экспоненциальная фаза производства
        while (readyComputers < rate + 1 && readyComputers < numComputers) {
            readyComputers *= 2;
            exponentialTime++;
        }

        if (readyComputers >= numComputers) {
            return exponentialTime;
        } else {
            // Линейная фаза производства
            int remainingComputers = numComputers - readyComputers;
            int linearTime = (remainingComputers + rate - 1) / rate;
            return exponentialTime + linearTime;
        }
    }
}

