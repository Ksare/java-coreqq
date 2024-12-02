package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner month = new Scanner(System.in);
        System.out.println("Введите название месяца: ");
        String месяц = month.nextLine();
        System.out.println("Введите количество дней в месяце: ");
        int дни = month.nextInt();

        System.out.println("Месяц: " + месяц + " содержит " + дни + " дней" );
        }
    }