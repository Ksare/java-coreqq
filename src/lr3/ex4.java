package lr3;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int num2 = scanner.nextInt();

        if (num1 < num2) {
               for (int i = num1; i <= num2; i++) {
                     System.out.println(i);
                 }
             }
             else {
                 for (int i = num2; i <= num1; i++) {
                     System.out.println(i);
                 }
             }
            }
        }

