package lr6;

public class ex7 {
    // Статический метод для преобразования символов в их коды
    public static int[] convertToCodes(char[] charArray) {
        if (charArray == null) {
            throw new IllegalArgumentException("Массив символов не может быть null.");
        }

        int[] codeArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            codeArray[i] = (int) charArray[i]; // Преобразование символа в его код
        }
        return codeArray;
    }

    // Основной метод для тестирования
    public static void main(String[] args) {
        char[] charArray = {'A', 'b', 'C', '1', '!'};

        // Преобразуем массив символов в массив кодов
        int[] codeArray = convertToCodes(charArray);

        // Вывод результатов
        System.out.println("Исходный массив символов: " + java.util.Arrays.toString(charArray));
        System.out.println("Массив кодов символов: " + java.util.Arrays.toString(codeArray));
    }
}


