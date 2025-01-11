package lr4;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод пользовательского алфавита
        System.out.println("Введите ваш алфавит:");
        String alphabet = scanner.nextLine();

        // Ввод текста для шифрования
        System.out.println("Введите текст для шифрования:");
        String text = scanner.nextLine();

        // Ввод ключа
        System.out.println("Введите ключ:");
        int key = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        // Шифрование текста
        String encryptedText = caesarCipher(text, alphabet, key);
        System.out.println("Текст после преобразования: " + encryptedText);

        // Запрос на обратное преобразование
        System.out.println("Выполнить обратное преобразование? (y/n):");
        String response = scanner.nextLine();

        if (response.equals("y")) {
            String decryptedText = caesarCipher(encryptedText, alphabet, -key);
            System.out.println("Обратное преобразование: " + decryptedText);
        } else if (response.equals("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ.");
        }
    }
        // Метод для шифрования/дешифрования с использованием пользовательского алфавита для задачи 10
        public static String caesarCipher(String text, String alphabet, int key) {
            char[] result = new char[text.length()];
            int alphabetLength = alphabet.length();

            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                int index = alphabet.indexOf(c);

                if (index != -1) {
                    // Сдвиг индекса с учетом длины алфавита
                    int newIndex = (index + key + alphabetLength) % alphabetLength;
                    result[i] = alphabet.charAt(newIndex);
                } else {
                    // Если символ не найден в алфавите, оставляем его без изменений
                    result[i] = c;
                }
            }

            // Преобразуем массив символов в строку
            return new String(result);
        }
    }


