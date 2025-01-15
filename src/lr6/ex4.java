package lr6;

public class ex4 {
    public static class ClassEx4{
        // Статический метод для вычисления двойного факториала
        public static long calculateDoubleFactorial(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("Число должно быть неотрицательным.");
            }

            long result = 1;
            for (int i = n; i > 0; i -= 2) {
                result *= i;
            }
            return result;
        }

        // Основной метод для тестирования
        public static void main(String[] args) {
            int n1 = 6; // Пример с четным числом
            int n2 = 5; // Пример с нечетным числом

            System.out.println("Двойной факториал " + n1 + "!! = " + calculateDoubleFactorial(n1));
            System.out.println("Двойной факториал " + n2 + "!! = " + calculateDoubleFactorial(n2));
        }
    }
}

