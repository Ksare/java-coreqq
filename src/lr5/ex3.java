package lr5;

public class ex3 {
    public static class ClassEx3{
        private int firstNumber;
        private int secondNumber;

        // Конструктор без аргументов
        public ClassEx3() {
            this.firstNumber = 0;
            this.secondNumber = 0;
        }

        // Конструктор с одним аргументом
        public ClassEx3(int number) {
            this.firstNumber = number;
            this.secondNumber = 0;
        }

        // Конструктор с двумя аргументами
        public ClassEx3(int firstNumber, int secondNumber) {
            this.firstNumber = firstNumber;
            this.secondNumber = secondNumber;
        }

        // Метод для вывода значений полей
        public void displayNumbers() {
            System.out.println("Первое число: " + firstNumber + ", Второе число: " + secondNumber);
        }
    }

    public static void main(String[] args) {
        // Создание объекта без аргументов
        ClassEx3 pair1 = new ClassEx3();
        pair1.displayNumbers();

        // Создание объекта с одним аргументом
        ClassEx3 pair2 = new ClassEx3(5);
        pair2.displayNumbers();

       // Создание объекта с двумя аргументами
        ClassEx3 pair3 = new ClassEx3(10, 20);
        pair3.displayNumbers();
    }
    }

