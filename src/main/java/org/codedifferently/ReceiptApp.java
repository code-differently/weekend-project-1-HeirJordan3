package org.codedifferently;

import java.util.Scanner;

public class ReceiptApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = scanner.nextLine();

        System.out.println("Enter your budget: ");

        String budgetText = scanner.nextLine();

        double budget = Double.parseDouble(budgetText);

        System.out.println("Enter a coupon code: ");

        String couponCode = scanner.nextLine();

        System.out.println();
        System.out.println("Welcome " + name + "!");
        System.out.println("Budget entered: " + budget);
        System.out.println("Coupon entered: " + couponCode);


        scanner.close();

    }
}
