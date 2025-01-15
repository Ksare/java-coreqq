package lr6;

public class ex5 {
    // Статический метод для вычисления суммы квадратов чисел через цикл
    public static long calculateSumOfSquares(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Число должно быть положительным.");
        }

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    // Статический метод для вычисления суммы квадратов чисел через формулу
    public static long calculateSumOfSquaresFormula(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Число должно быть положительным.");
        }

        return (long) n * (n + 1) * (2 * n + 1) / 6;
    }

    // Основной метод для тестирования
    public static void main(String[] args) {
        int n = 5; // Пример числа n

        // Вычисление суммы квадратов через цикл
        long sumViaLoop = calculateSumOfSquares(n);
        System.out.println("Сумма квадратов чисел от 1 до " + n + " через цикл: " + sumViaLoop);

        // Вычисление суммы квадратов через формулу
        long sumViaFormula = calculateSumOfSquaresFormula(n);
        System.out.println("Сумма квадратов чисел от 1 до " + n + " через формулу: " + sumViaFormula);

        // Проверка совпадения результатов
        System.out.println("Результаты совпадают: " + (sumViaLoop == sumViaFormula));
    }
}

