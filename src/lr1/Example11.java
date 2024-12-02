package lr1;

import java.time.Year;
import java.time.Period;
import java.time.LocalDate;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args){
        Scanner data = new Scanner(System.in);
        System.out.println("Введите свое имя: ");
        String name = data.nextLine();


        System.out.println("Введите свой год рождения: ");
        int year = data.nextInt();

        LocalDate DateBirth = LocalDate.of(year, 1, 1);
        LocalDate Today = LocalDate.now();

        int age = Period.between(DateBirth, Today).getYears();

        System.out.println("Вас зовут: " + name + " Ваш возраст: " + age);





    }
}
