package lr4;

public class ex1 {
    public static void main(String[] args) {
        int width = 23;
        int height = 11;

        // Цикл для высоты
        for (int i = 0; i < height; i++) {
            // Цикл для ширины
            for (int j = 0; j < width; j++) {
                System.out.print(" *");
            }
            System.out.println(); //переход на другую строку
        }
    }
}