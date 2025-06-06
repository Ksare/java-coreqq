package lr13;

public class ex12 {
    public static void m(String str, double chislo) {
        if (str == null || chislo > 0.001) {
            throw new IllegalArgumentException(
                    "Некорректные аргументы: строка " + str + ", число " + chislo
            );
        }
        System.out.println("Аргументы корректны!");
    }

    public static void main(String[] args) {
        try {
            m(null, 0.000001);
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}

