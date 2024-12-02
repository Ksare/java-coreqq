package lr1;

import java.time.Year;
import java.time.Period;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Example12 {
    public static void main(String[] args){
        Scanner YearOfBirth = new Scanner(System.in);
        System.out.println("Введите ваш возраст: ");
        int age = YearOfBirth.nextInt();

        LocalDate now = LocalDate.now();
        LocalDate birth = now.minusYears(age);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
        System.out.println("Ваш год рождения: " + birth.format(formatter));
    }
}
