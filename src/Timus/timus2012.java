package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class timus2012 {

      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            PrintWriter output = new PrintWriter(System.out);

            int numberOfTasks = input.nextInt();

            int difference = 12 - numberOfTasks;

            int time = difference * 45;

            String result = time <= 240 ? "YES" : "NO";

            output.println(result);
            output.flush();
        }
    }

