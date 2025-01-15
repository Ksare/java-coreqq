package lr6;

public class ex2 {
    public static class ClassEx2{
        private static int counter = 0;

        // Статический метод для отображения и увеличения значения поля
        public static void displayAndIncrement() {
            System.out.println("Текущее значение статического поля: " + counter);
            counter++;
        }

        // Основной метод для тестирования
        public static void main(String[] args) {
            // Вызов статического метода несколько раз
            ClassEx2.displayAndIncrement();
            ClassEx2.displayAndIncrement();
            ClassEx2.displayAndIncrement();
        }
    }

}

