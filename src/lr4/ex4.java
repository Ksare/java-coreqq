package lr4;

public class ex4 {
    public static void main(String[] args) {
        int height = 11; // Высота треугольника

       // Создаем двумерный массив
        int[][] triangle = new int[height][]; //height в роли кол-ва массивов

        // Заполнение
        for (int i = 0; i < height; i++) {
            // Для каждой строки создаем массив длиной i+1
            triangle[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = 2; // Заполняем цифрой 2
            }
        }
        // Вывод массива
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j]);
            }
            System.out.println();
       }
    }
}
