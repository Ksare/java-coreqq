package Timus;

import java.util.Scanner;

public class timus1880 {
    public static void main(String args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение данных первого участника
        int n1 = scanner.nextInt();
        int[] player1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            player1[i] = scanner.nextInt();
        }

        // Чтение данных второго участника
        int n2 = scanner.nextInt();
        int[] player2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            player2[i] = scanner.nextInt();
        }

        // Чтение данных третьего участника
        int n3 = scanner.nextInt();
        int[] player3 = new int[n3];
        for (int i = 0; i < n3; i++) {
            player3[i] = scanner.nextInt();
        }

        // Поиск общих чисел
        int i = 0, j = 0, k = 0;
        int count = 0;

        while (i < n1 && j < n2 && k < n3) {
            if (player1[i] == player2[j] && player2[j] == player3[k]) {
                count++;
                i++;
                j++;
                k++;
            } else {
                int min = Math.min(player1[i], Math.min(player2[j], player3[k]));
                if (player1[i] == min) i++;
                if (player2[j] == min) j++;
                if (player3[k] == min) k++;
            }
        }

        System.out.println(count);
    }
}

