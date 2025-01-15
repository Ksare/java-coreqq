package lr6;

public class ex9 {
    // Статический метод для реверса символов в массиве
    public static void reverseArray(char[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Массив не может быть null.");
        }

        int left = 0;
        int right = array.length - 1;

        // Меняем местами элементы
        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    // Основной метод для тестирования
    public static void main(String[] args) {
        char[] array = {'A', 'B', 'C', 'D', 'E'};

        System.out.println("Исходный массив: " + java.util.Arrays.toString(array));

        // Вызываем метод для реверса массива
        reverseArray(array);

        System.out.println("Реверсированный массив: " + java.util.Arrays.toString(array));
    }
}

