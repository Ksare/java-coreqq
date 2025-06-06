package Timus;

import java.util.Scanner;

public class timus1991 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Чтение количества миссий и зарядов на дроида
        int missionsCount = input.nextInt();
        int chargesPerDroid = input.nextInt();

        int remainingCharges = 0;
        int survivingDroidsCount = 0;

        // Обработка результатов каждой миссии
        for (int mission = 0; mission < missionsCount; mission++) {
            int chargesUsed = input.nextInt();

            if (chargesUsed > chargesPerDroid) {
                remainingCharges += (chargesUsed - chargesPerDroid);
            } else {
                survivingDroidsCount += (chargesPerDroid - chargesUsed);
            }
        }

        input.close();
        // Вывод результатов: неиспользованные заряды и выжившие дроиды
        System.out.println(remainingCharges + " " + survivingDroidsCount);
    }
}

