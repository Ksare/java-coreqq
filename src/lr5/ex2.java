package lr5;

public class ex2 {
    public static class ClassEx2 {
        private char startSymbol;
        private char endSymbol;

        public void setSymbols(char startSymbol, char endSymbol) {
            this.startSymbol = startSymbol;
            this.endSymbol = endSymbol;
        }

        // Метод для вывода символов между startSymbol и endSymbol
        public void displaySymbolsInRange() {
            if (startSymbol > endSymbol) {
                System.out.println("Начальный символ не может быть больше конечного.");
                return;
            }

            System.out.print("Символы от '" + startSymbol + "' до '" + endSymbol + "': ");
            for (char c = startSymbol; c <= endSymbol; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            ClassEx2 classExample = new ClassEx2();
            classExample.startSymbol = 'A';
            classExample.endSymbol = 'D';
            classExample.displaySymbolsInRange();
        }
    }
}
