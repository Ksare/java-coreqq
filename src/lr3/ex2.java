package lr3;


import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner days = new Scanner(System.in);
        System.out.println("Введите название недели(с маленькой буквой) : ");

        String daysnumb = days.nextLine();

        switch (daysnumb){
            case "понедельник":
                System.out.println(daysnumb + ": " + "Порядковый номер дня в неделе: 1");
                break;
            case "вторник":
                System.out.println(daysnumb + ": " + "Порядковый номер дня в неделе: 2");
                break;
            case "среда":
                System.out.println(daysnumb + ": " + "Порядковый номер дня в неделе: 3");
                break;
            case "четверг":
                System.out.println(daysnumb + ": " + "Порядковый номер дня в неделе: 4");
                break;
            case "пятница":
                System.out.println(daysnumb + ": " + "Порядковый номер дня в неделе: 5");
                break;
            case "суббота":
                System.out.println(daysnumb + ": " + "Порядковый номер дня в неделе: 6");
                break;
            case "воскресенье":
                System.out.println(daysnumb + ": " + "Порядковый номер дня в неделе: 7");
                break;
            default:
                System.out.println("Такого дня нет ");
        }

    }
}
