package lr1;

import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {
        Scanner ИмяВозраст = new Scanner(System.in);
        System.out.println("Ваше Имя: ");
        String имя = ИмяВозраст.nextLine();
        System.out.println("Введите ваш возраст: ");
        int age = ИмяВозраст.nextInt();

        System.out.println("Вас зовут " + имя + ". Ваш возраст: " + age);

    }

}
