package com.studenttheironyard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome!");
        System.out.println("What's your name?");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("Welcome " + name);

        System.out.println("Choose your option: [Check my balance, Withdraw funds, or Cancel transaction]");
        String option = scanner.nextLine();

        if (option.equalsIgnoreCase("Check my balance")) {
            System.out.println("Your balance is $100.00");

        } else if (option.equalsIgnoreCase("Cancel")) {
            System.out.println("Thank you, please come again!");

        } else if (option.equalsIgnoreCase("Withdraw funds")) {
            System.out.println("Enter the amount you wish to withdraw");
            String num = scanner.nextLine();
            int numInt = Integer.valueOf(num);

            if (numInt < 100) {
                System.out.println("Please take you money and have a nice day!");
            } else {
                throw new Exception("You don't have money like that!");

            }
        }
    }
}
