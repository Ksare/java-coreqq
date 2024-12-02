package lr1;
import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner math = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = math.nextInt();

        int min = num - 1;
        int plus = num + 1;
        int square = num * num + min * min + plus * plus;

        System.out.println("Последовательность чисел:");
        System.out.println(min + ", " + num + ", " + plus + ", " + square);
    }
}