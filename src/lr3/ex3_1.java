package lr3;

import java.util.Scanner;

public class ex3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел в последовательности Фибоначчи: ");
        int numb = scanner.nextInt();

        int num1 = 1;
        int num2 = 1;
        int num3 = 0;

        System.out.println("Последовательность чисел Фибоначчи: ");
        for (int i = 1;  i <= numb; i++){
            if (i <= 2) {
                System.out.println(num1);
            } else{
                num3 = num1 + num2;
                System.out.println(num3);
                num1=num2;
                num2=num3;
            }
        }
    }
}
