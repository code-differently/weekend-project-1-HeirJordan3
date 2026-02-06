package org.codedifferently;

import java.util.Random;
import java.util.Scanner;

public class ReceiptApp {

    public static double roundMoney(Double amount){
        return Math.round(amount * 100.0) / 100.0;
    }

    public static void main(String[] args) {

        // ==== USER INPUT ====
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = scanner.nextLine();

        System.out.println("Enter your budget: ");


        String budgetText = scanner.nextLine();

        double budget = Double.parseDouble(budgetText);

        System.out.println("Enter a coupon code: ");

        String couponCode = scanner.nextLine();


        Random rand = new Random();

        int visitId = 1000 + rand.nextInt(9000);

        double item1 = 5 + rand.nextDouble() * 35;
        double item2 = 10 + rand.nextDouble() * 70;
        double item3 = 3 + rand.nextDouble() * 22;

        item1 = roundMoney(item1);

        item2 = roundMoney(item2);

        item3 = roundMoney(item3);

        double subTotal = item1 + item2 + item3;
        subTotal = roundMoney(subTotal);





        System.out.println();
        System.out.println("Welcome " + name + "!");
        System.out.println("Budget entered: " + budget);
        System.out.println("Coupon entered: " + couponCode);

        System.out.println("\n--- TEST OUTPUT ---");
        System.out.println("Visit ID: " + visitId);
        System.out.println("Item 1: " + item1);
        System.out.println("Item 2: " + item2);
        System.out.println("Item 3: " + item3);
        System.out.println("Subtotal: $" + subTotal);


        scanner.close();

    }
}
