package lr13;

public class ex4 {
        public static void main(String[] args) {
            try {
                System.out.println("0");
                throw new RuntimeException("ошибка");
            } catch (NullPointerException e) {
                System.out.println("1");
            } catch (Exception e) {
                System.out.println("2");
            } catch (Error e) {
                System.out.println("3");
            } finally {
                System.out.println("4");
            }
        }
    }

