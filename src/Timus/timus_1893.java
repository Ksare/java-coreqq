package Timus;

import java.util.Scanner;

public class timus_1893 {


    public static String determineSeatLocation(String seatCode) {

        int row = Integer.parseInt(seatCode.substring(0, seatCode.length() - 1));
        char seat = seatCode.charAt(seatCode.length() - 1);


        if (row >= 1 && row <= 20) {
            if (row <= 2) {
                if (seat == 'A' || seat == 'D') {
                    return "window";
                } else if (seat == 'B' || seat == 'C') {
                    return "aisle";
                }
            } else {
                if (seat == 'A' || seat == 'F') {
                    return "window";
                } else if (seat == 'C' || seat == 'D') {
                    return "aisle";
                }
            }
        }

        else if (row >= 21 && row <= 65) {
            if (seat == 'A' || seat == 'K') {
                return "window";
            } else if (seat >= 'C' && seat <= 'D') {
                return "aisle";
            } else if (seat >= 'H' && seat <= 'J') {
                return "aisle";
            }
        }
        return "neither";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seatCode = scanner.nextLine().trim().toUpperCase();

        String result = determineSeatLocation(seatCode);
        System.out.println(result);
    }
}


