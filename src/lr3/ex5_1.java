package lr3;

import java.util.Scanner;

public class ex5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во чисел:");
        int quantity = scanner.nextInt();
        int sum = 0;
        System.out.println("Введите числа");
        for (int i = 0; i < quantity; i++) {
                int num = scanner.nextInt();
                 if(num % 5 == 2 || num % 3 == 1){
                     sum+= num;
                 }
             }

        System.out.println(sum);
    }
}
