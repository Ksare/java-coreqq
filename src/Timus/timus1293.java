package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class timus1293 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintWriter output = new PrintWriter(System.out);
        int N = input.nextInt();
        int A = input.nextInt();
        int B = input.nextInt();
        int result = N*A*B*2;
        output.println(result);
        output.flush();
    }
}

