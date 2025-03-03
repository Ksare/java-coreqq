package lr9;

import java.util.HashMap;
import java.util.Map;

public class ex10 {
        public static void main(String[] args) {
            // Создаем коллекцию для хранения данных
            HashMap<Integer, String> dataMap = new HashMap<>();

            // Заполняем данными
            dataMap.put(0, "Ноль");
            dataMap.put(1, "Первый");
            dataMap.put(2, "Второй");
            dataMap.put(3, "Третий");
            dataMap.put(4, "Четвертый");
            dataMap.put(5, "Пятый");
            dataMap.put(6, "Шестой");
            dataMap.put(7, "Седьмой");
            dataMap.put(8, "Восьмой");
            dataMap.put(9, "Девятый");


            // Выводим элементы с ключом больше 5
            System.out.println("Элементы с ключом > 5:");
            for (Map.Entry<Integer, String> entry : dataMap.entrySet()) {
                if (entry.getKey() > 5) {
                    System.out.println("ID: " + entry.getKey() + ", Значение: " + entry.getValue());
                }
            }

            // Обрабатываем элемент с ключом 0
            if (dataMap.containsKey(0)) {
                System.out.println("Элемент с нулевым ключом: " + dataMap.get(0));
            }

            // Вычисляем произведение ключей для строк длиннее 5 символов
            int resultProduct = 1;
            for (Map.Entry<Integer, String> entry : dataMap.entrySet()) {
                if (entry.getValue().length() > 5) {
                    resultProduct *= entry.getKey();
                }
            }
            System.out.println("Произведение ключей для строк длиной > 5: " + resultProduct);
        }
}