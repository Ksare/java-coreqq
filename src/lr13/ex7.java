package lr13;

public class ex7 {
        public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            try {
                System.out.println("1");
                throw new ArithmeticException();
            } catch (ArithmeticException exception) {
                System.out.println("4");
            }
        } catch (ArithmeticException e) {
            System.out.println("2");
        } finally {
            System.out.println("3");
        }
    }
}

