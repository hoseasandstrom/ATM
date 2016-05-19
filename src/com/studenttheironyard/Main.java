package com.studenttheironyard;

import java.util.Scanner;

public class Main {

    public static Scanner scanner;

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome!");
        System.out.println("What's your name?");

        Scanner scanner = new Scanner(System.in);

        Customer customer = new Customer();

        customer.chooseName();
        customer.chooseOption();

    }
}
