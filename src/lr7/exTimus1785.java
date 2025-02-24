package lr7;

import java.io.PrintWriter;
import java.util.Scanner;

public class exTimus1785 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            PrintWriter output = new PrintWriter(System.out);

            int a = input.nextInt();

            if (1<= a && a<=4) output.println("few");

            else if (5<= a && a<= 9) output.println("several");

            else if (10 <= a && a <= 19) output.println("pack");

            else if (20 <= a && a <= 49) output.println("lots");

            else if (50 <= a && a <= 99) output.println("horde");

            else if (100 <= a && a<= 249) output.println("throng");

            else if (250 <= a && a<= 499) output.println("swarm");

            else if (500 <= a && a<= 999) output.println("zounds");

            else if (1000 <= a) output.println("legion");

            output.flush();
        }
    }

