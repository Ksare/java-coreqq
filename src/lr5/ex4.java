package lr5;

public class ex4 {
public static class ClassEx4 {
    private char symbol;
    private int number;

    // Конструктор с двумя аргументами (целое число и символ)
    public ClassEx4(int number, char symbol) {
        this.number = number;
        this.symbol = symbol;
    }

    // Конструктор с одним аргументом типа double
    public ClassEx4(double value) {
        // Целая часть задает код символа
        this.symbol = (char) ((int) value);
        // Дробная часть (десятые и сотые) задает значение целочисленного поля
        this.number = (int) ((value - (int) value) * 100);
    }

    // Метод для вывода значений полей
    public void displayValues() {
        System.out.println("Символ: " + symbol + ", Число: " + number);
    }
}

    public static void main(String[] args) {
    // Создание объекта с целым числом и символом
        ClassEx4 obj1 = new ClassEx4(65, 'A');
        obj1.displayValues();

        // Создание объекта с аргументом типа double
        ClassEx4 obj2 = new ClassEx4(65.1267);
        obj2.displayValues();
    }
}

