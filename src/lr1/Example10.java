package lr1;

import java.time.Year;
import java.time.Period;
import java.time.LocalDate;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args){
        Scanner рождение = new Scanner(System.in);
         System.out.print("Введите год своего рождения: ");
         int год = рождение.nextInt();

        LocalDate датаРождения = LocalDate.of(год, 1, 1);
        LocalDate сегодня = LocalDate.now();

        int age = Period.between(датаРождения, сегодня).getYears();

        System.out.println("Ваш возраст: " + age);
    }


}
