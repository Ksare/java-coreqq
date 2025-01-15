package lr5;

public class ex1 {
    public static class ClassEx1 {
        private char symbol;

        // Метод для присвоения значения полю
        public void setSymbol(char symbol) {
            this.symbol = symbol;
        }

        // Метод для получения кода символа
        public int getSymbolCode() {
            return (int) symbol;
        }

        // Метод для вывода символа и его кода в консоль
        public void displaySymbolInfo() {
            System.out.println("Символ: " + symbol + ", Код: " + (int) symbol);
        }
    }

    public static void main(String[] args) {
        ClassEx1 classEx1 = new ClassEx1();
        classEx1.setSymbol('q');
        classEx1.displaySymbolInfo();
    }
}