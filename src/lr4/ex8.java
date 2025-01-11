package lr4;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод текста для шифрования
        System.out.println("Введите текст для шифрования:");
        String text = scanner.nextLine();

        // Ввод ключа
        System.out.println("Введите ключ:");
        int key = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        // Шифрование текста
        String encryptedText = caesarShifr(text, key);
        System.out.println("Текст после преобразования: " + encryptedText);

        // Запрос на обратное преобразование
        System.out.println("Выполнить обратное преобразование? (y/n):");
        String response = scanner.nextLine();

        if (response.equals("y")) {
            String decryptedText = caesarShifr(encryptedText, -key);
            System.out.println("Обратное преобразование: " + decryptedText);
        } else if (response.equals("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ.");
        }
    }
    // Метод для шифрования/дешифрования для задачи 8
    public static String caesarShifr(String text, int key) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'А' && c <= 'Я') { // Для заглавных букв
                c = (char) ((c - 'А' + key) + 'А');
            } else if (c >= 'а' && c <= 'я') { // Для строчных букв
                c = (char) ((c - 'а' + key)+ 'а');
            }
            result += c; // Добавляем символ к результату
        }
        return result;
    }
}
