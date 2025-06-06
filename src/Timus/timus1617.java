package Timus;

import java.util.HashMap;
import java.util.Scanner;

public class timus1617 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение количества колесных пар
        int n = scanner.nextInt();

        // Подсчет количества пар каждого диаметра
        HashMap<Integer, Integer> diameterCount = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int diameter = scanner.nextInt();
            diameterCount.put(diameter, diameterCount.getOrDefault(diameter, 0) + 1);
        }

        // Расчет количества вагонов
        int wagons = 0;
        for (int count : diameterCount.values()) {
            wagons += count / 4;
        }

        System.out.println(wagons);
    }
}

