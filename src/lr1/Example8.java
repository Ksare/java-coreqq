package lr1;

import java.util.Scanner;
public class Example8 {
    public static void main(String[] args){
        Scanner дата = new Scanner(System.in);
        System.out.println("Введите название дня недели: ");
        String день = дата.nextLine();
        System.out.println("Введите название текущего месяца: ");
        String месяц = дата.nextLine();
        System.out.println("Введите число текущей даты: ");
        int номер = дата.nextInt();

        System.out.println("Сегодня: " + день + ", " + номер + " " + месяц);

    }
}
