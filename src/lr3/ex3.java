package lr3;

import java.util.Scanner;
// Версия с while и switch
public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел в последовательности Фибоначчи: ");
        int numb = scanner.nextInt();


        int num1 = 1;
        int num2 = 1;
        int num3 = 0;

        System.out.println("Последовательность чисел Фибоначчи: ");

        int nums = 1;
        while (nums <= numb) {
            switch (nums) {
                case 1:
                    System.out.println(num1);
                    break;
                case 2:
                    System.out.println(num2);
                    break;
                default:
                    num3 = num1 + num2;
                    System.out.println(num3);
                    num1 = num2;
                    num2 = num3;
                    break;
            }
            nums++;
            }
        scanner.close();
        }
    }

