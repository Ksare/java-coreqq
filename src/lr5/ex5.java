package lr5;

public class ex5 {
public static class ClassEx5{
    private int number;

    // Конструктор без аргументов
    public ClassEx5() {
        this.number = 0; // Поле получает нулевое значение
    }

    // Конструктор с целочисленным аргументом
    public ClassEx5(int number) {
        setNumber(number); // Устанавливаем значение через метод
    }

    // Метод для установки значения поля (с аргументом)
    public void setNumber(int number) {
        if (number > 100) {
            this.number = 100; // Если значение больше 100, устанавливаем 100
        } else {
            this.number = number; // Иначе устанавливаем переданное значение
        }
    }

    // Метод для установки значения поля (без аргументов)
    public void setNumber() {
        this.number = 0; // Устанавливаем нулевое значение
    }

    // Метод для проверки значения поля
    public int getNumber() {
        return this.number;
    }
}

    public static void main(String[] args) {
                // Создаем объект без аргументов
        ClassEx5 handler1 = new ClassEx5();
        System.out.println("Значение поля (по умолчанию): " + handler1.getNumber());

        // Создаем объект с аргументом
        ClassEx5 handler2 = new ClassEx5(120);
        System.out.println("Значение поля (с аргументом 120): " + handler2.getNumber());

        // Устанавливаем значение через метод с аргументом
        handler1.setNumber(80);
        System.out.println("Значение поля (установлено 80): " + handler1.getNumber());

        // Устанавливаем значение через метод с аргументом > 100
        handler1.setNumber(150);
        System.out.println("Значение поля (установлено 150): " + handler1.getNumber());
        // Устанавливаем значение через метод без аргументов
        handler1.setNumber();
        System.out.println("Значение поля (установлено по умолчанию): " + handler1.getNumber());
    }

}

