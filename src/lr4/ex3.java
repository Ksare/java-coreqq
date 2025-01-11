package lr4;

public class ex3 {
    public static void main(String[] args) {
        int width = 23; // ширина прямоугольника
     int height = 11; // высота прямоугольника

        int[][] rectangle = new int[height][width]; //height в роли кол-ва массивов width в роли длины массивов внутри массивов
   // Заполнение
       for (int i = 0; i < height; i++) {
           for (int j = 0; j < width; j++) {
               rectangle[i][j] = 2;
           }
       }

       // Вывод массива
       for (int i = 0; i < height; i++) {
           for (int j = 0; j < width; j++) {
               System.out.print(rectangle[i][j]);
            }
            System.out.println();
        }
    }
}
