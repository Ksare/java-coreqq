package lr3;

import java.util.Scanner;

public class ex4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int num2 = scanner.nextInt();

        if (num1 < num2) {
            int i = num1;
            while (i <= num2) {
                System.out.println(i);
                i++;
            }
        }
        else {
            int i = num2;
            while (i <= num1) {
                System.out.println(i);
                i++;
            }
        }
    }
}
