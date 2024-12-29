package lr3;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во чисел:");
        int quantity = scanner.nextInt();
        int sum = 0;
        int counter = 0;
        System.out.println("Введите числа");
        while (counter < quantity) {
            int num = scanner.nextInt();
            if(num % 5 == 2 || num % 3 == 1){
                sum+= num;
            }
            counter++;
        }
        System.out.println(sum);
    }
}
