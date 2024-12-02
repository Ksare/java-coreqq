package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
    Scanner twonumbers = new Scanner(System.in);

    System.out.print("Введите первое число: ");
    int num1 = twonumbers.nextInt();

    System.out.print("Введите второе число: ");
    int num2 = twonumbers.nextInt();

    int sum = num1 + num2;
    int min = num1 - num2;

    System.out.println("Сумма чисел: " + sum);
    System.out.println("Разность чисел: " + min);
}
}
