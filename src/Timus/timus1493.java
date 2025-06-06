package Timus;

import java.util.Scanner;

public class timus1493 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String ticketNumber = input.next();
            input.close();

            System.out.println(isNearLucky(ticketNumber) ? "Yes" : "No");
        }

        public static boolean isNearLucky(String ticket) {
            int number = Integer.parseInt(ticket);
            return isBalanced(number - 1) || isBalanced(number + 1);
        }

        public static boolean isBalanced(int number) {
            String ticket = String.format("%06d", number);
            int firstHalfSum = ticket.charAt(0) - '0' + ticket.charAt(1) - '0' + ticket.charAt(2) - '0';
            int secondHalfSum = ticket.charAt(3) - '0' + ticket.charAt(4) - '0' + ticket.charAt(5) - '0';
            return firstHalfSum == secondHalfSum;
        }
    }

