package lr3;

public class ex8 {
    public static void main(String[] args) {

        char[] consonants = new char[10];
        int index = 0;

        for (char c = 'A'; c <= 'Z'; c++) {
            // Пропускаем гласные
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y') continue;

            if (index < consonants.length) {
                consonants[index] = c;
                index++;
            }
            else break;
        }

        System.out.println("Содержимое массива:");
        for (char consonant : consonants) {
            System.out.print(consonant + " ");
        }
    }
}
