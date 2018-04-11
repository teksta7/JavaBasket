package com.jake;

import java.util.Scanner;

public class Main {

    public static void menu()
    {
        int choice = 5;
        int secondChoice = 0;
        Scanner input = new Scanner(System.in);
        Basket basket = Basket.getInstance();
        Item currentItem = new Item();
        while (choice > 0) {
            System.out.println("Type 1, 2 or 3 for your option");
            System.out.println("1: Add item to basket");
            System.out.println("2: View basket");
            System.out.println("3: Calculate basket");
            System.out.println("4: Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Select the number for the product to add");
                    System.out.println("1: Apples - £1.00");
                    System.out.println("2: Bread - £0.80");
                    System.out.println("3: Soup - £0.65");
                    System.out.println("4: Milk - £1.30");
                    secondChoice = input.nextInt();
                    switch(secondChoice){
                        case 1:
                            currentItem = new Apples();
                            basket.addToBasket(currentItem);
                            break;
                        case 2:
                            currentItem = new Bread();
                            basket.addToBasket(currentItem);
                            break;
                        case 3:
                            currentItem = new Soup();
                            basket.addToBasket(currentItem);
                            break;
                        case 4:
                            currentItem = new Milk();
                            basket.addToBasket(currentItem);
                            break;
                        default:
                            System.out.println("Invalid option, item does not exist");;
                            break;
                    }
                case 2:
                    basket.showBasket();
                    break;

                case 3:
                    break;
                default:
                    System.out.println("Thank you for using this store");
                    choice = 0;
            }
        }


    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to the store please select your option");
        menu();
    }
}
