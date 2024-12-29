package lr3;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во чисел:");
        int quantity = scanner.nextInt();
        if(quantity <= 0){
            System.out.println("Неправильное значение!!");
        }else{
            int[] array = new int[quantity];
            int num = 0;
            for (int index = 0; index < array.length;) {
                if(num % 5 == 2){
                    array[index] = num;
                    index++;
                }
                num++;
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
