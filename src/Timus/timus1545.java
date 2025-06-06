package Timus;

import java.util.ArrayList;
import java.util.Scanner;

public class timus1545 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Чтение количества символов
        int count = input.nextInt();
        input.nextLine(); // Переход на следующую строку

        // Чтение символов
        ArrayList<String> symbols = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            symbols.add(input.nextLine());
        }

        // Чтение искомого символа
        char searchChar = input.nextLine().charAt(0);

        // Поиск и вывод подходящих символов
        for (String symbol : symbols) {
            if (symbol.charAt(0) == searchChar) {
                System.out.println(symbol);
            }
        }
    }
}
