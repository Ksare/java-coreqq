package lr13;

public class ex1 {
        public static void main(String[] args) {
            try {
                System.out.println("0");
                throw new RuntimeException("Непроверяемая ошибка");
            } catch (RuntimeException e) { // исключение перехвачено
                System.out.println("1  " + e);  // исключение обработано
            } finally {
                System.out.println("2");
            }
        }
    }
