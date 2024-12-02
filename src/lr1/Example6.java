package lr1;

import java.util.Scanner;
public class Example6 {
   public static void main(String[] args ) {
       Scanner фио = new Scanner(System.in);
       System.out.println("Введите фамилию: ");
       String фамилия = фио.nextLine();
       System.out.println("Введите имя: ");
       String имя =фио.nextLine();
       System.out.println("Введите отчество: ");
       String отчество =фио.nextLine();

       System.out.println("Hello " +  фамилия + ", " +  имя + ", " + отчество);
       фио.close();


   }
}
