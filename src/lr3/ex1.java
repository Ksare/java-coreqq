package lr3;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите целое число ");
        int numb = number.nextInt();
        if(numb < 1 || numb > 7 ){
            System.out.println("Введено некорректное числовое значение, повторите попытку. ");}
        else {
            switch (numb){
                case 1:
                    System.out.println("День недели: Понедельник ");
                    break;
                case 2:
                    System.out.println("День недели: Вторник ");
                    break;
                case 3:
                    System.out.println("День недели: Среда ");
                    break;
                case 4:
                    System.out.println("День недели: Четверг ");
                    break;
                case 5:
                    System.out.println("День недели: Пятница ");
                    break;
                case 6:
                    System.out.println("День недели: Суббота ");
                    break;
                case 7:
                    System.out.println("День недели: Воскресенье ");
                    break;

            }
        }
    }
}
