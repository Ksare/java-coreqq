package lr8.timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class timus_1001 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        List<String> numbers = new ArrayList<>();

        // Читаем все строки до конца файла
        while ((line = reader.readLine()) != null) {
            numbers.addAll(Arrays.asList(line.trim().split("\\s+")));
        }

        // Создаем формат для вывода
        DecimalFormat df = new DecimalFormat("#.####");
        df.setMinimumFractionDigits(4);

        // Обрабатываем числа в обратном порядке
        for (int i = numbers.size() - 1; i >= 0; i--) {
            try {
                long num = Long.parseLong(numbers.get(i));
                double result = Math.sqrt(num);
                System.out.println(df.format(result));
            } catch (NumberFormatException e) {
                // Пропускаем некорректные значения
            }
        }
    }
}

