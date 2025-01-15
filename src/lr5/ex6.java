package lr5;

public class ex6 {
    public static class ClassEx6{
        private int max;
        private int min;

        // Конструктор без аргументов (инициализирует поля значениями по умолчанию)
        public ClassEx6() {
            this.max = Integer.MIN_VALUE; // Минимальное значение для max
            this.min = Integer.MAX_VALUE; // Максимальное значение для min
        }

        // Конструктор с двумя аргументами
        public ClassEx6(int a, int b) {
            setValues(a, b); // Устанавливаем значения через метод
        }

        // Метод для установки значений полей с двумя аргументами
        public void setValues(int a, int b) {
            if (a > b) {
                this.max = a;
                this.min = b;
            } else {
                this.max = b;
                this.min = a;
            }
        }

        // Метод для установки значений полей с одним аргументом
        public void setValues(int a) {
            if (a > this.max) {
                this.max = a;
            }
            if (a < this.min) {
                this.min = a;
            }
        }

        // Метод для отображения значений полей
        public void displayValues() {
            System.out.println("Значение max: " + max + ", Значение min: " + min);
        }
    }

    public static void main(String[] args) {
                // Создаем объект без аргументов
        ClassEx6 handler1 = new ClassEx6();
        handler1.displayValues();

        // Устанавливаем значения полей с двумя аргументами
        handler1.setValues(10, 20);
        handler1.displayValues();

        // Устанавливаем значение поля с одним аргументом
        handler1.setValues(5);
        handler1.displayValues();

       // Устанавливаем значение, превышающее max
        handler1.setValues(25);
        handler1.displayValues();

        // Создаем объект с двумя аргументами
        ClassEx6 handler2 = new ClassEx6(50, 30);
        handler2.displayValues();
    }
    }



