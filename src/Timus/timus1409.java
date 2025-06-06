package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class timus1409 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintWriter output = new PrintWriter(System.out);

        int gHit = input.nextInt();
        int lHit =  input.nextInt();
        int totalCans = gHit + lHit - 1;
        int gMiss = totalCans - gHit;
        int lMiss = totalCans - lHit;

        output.println(gMiss + " " + lMiss);
        output.flush();
    }
}
