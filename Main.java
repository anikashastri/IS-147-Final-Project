package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO SHOEWORLD!");


        System.out.println("----------Join our family!----------");

        System.out.println("Enter your first name:");
        String firstname = sc.next();
        System.out.println("Enter your last name:");
        String lastname = sc.next();
        System.out.println("Let's buy some shoes!");


        System.out.println("----------Shoes!----------");

        Project();
        payment one = new payment(1, 2, 3);

        System.out.println();
    }

    public static void Project() {
        int stars = 1;

        for (int a = stars - 1; a >= 0; a--) {
            for (int s = 0; s <= a; s++) {
                System.out.print("*");
            }
            System.out.println();

            String[][] shoes = new String[4][3];

            shoes[0][0] = "Running Shoes";
            shoes[0][1] = "Size 7,8,9";
            shoes[0][2] = "Black";

            shoes[1][0] = " Strappy Heels";
            shoes[1][1] = "Size 7,8,9";
            shoes[1][2] = "Gold";

            shoes[2][0] = " Fuzzy Boots";
            shoes[2][1] = "Size 7,8,9";
            shoes[2][2] = "Tan";

            shoes[3][0] = "Slip-ons";
            shoes[3][1] = "Size 7,8,9";
            shoes[3][2] = "White";


            int rows = 4;
            int columns = 3;
            int i, j;

            System.out.println("| Shoe Type | Shoe Size | Color |");
            System.out.println("----------------------------------");

            for (i = 0; i < rows; i++) {
                for (j = 0; j < columns; j++) {
                    System.out.print(shoes[i][j] + " | ");
                }
                System.out.println();
                System.out.println("----------------------------------");


            }


            Scanner sc1 = new Scanner(System.in);
            System.out.println("Would you like to buy a shoe? true for yes, false for no");
            String buy = sc1.next();

            boolean buyshoe = true;
            boolean buyshoe1 = false;
            if (buyshoe = true) {
                System.out.println("Okay great!");
            } else {
                System.out.println("We're sad to see you go");
            }

            Scanner sc = new Scanner(System.in);
            System.out.println("Which shoe would you like? 1 for Running shoe, 2 for Strappy heels, 3 for Fuzzy boots and, 4 for Slip-ons");
            String whichshoe = sc.next();
            System.out.println("What size would you like? Choose between sizes 7-9");
            String whatsize = sc.next();


            int shoe = 1;
            switch (shoe) {
                case 1:
                    System.out.println("Running shoe price: $127.99");
                    break;
                case 2:
                    System.out.println("Strappy heel price: $250.00");
                    break;
                case 3:
                    System.out.println("Fuzzy boot price: $399.99");
                    break;
                case 4:
                    System.out.println("Slip-on price: $60.00");
                    break;


            }
            Scanner sco1 = new Scanner(System.in);
            System.out.println("Shall we continue to shipping? true for yes, false for no");
            String payment = sco1.next();
        }

        boolean ship = true;
        boolean ship1 = false;
        if (ship = true) {
            System.out.println("----------Shipping!----------");
        } else {
            System.out.println("Let's Continue to Payment!");

        }


        String[][] Shipping = new String[4][3];

        Shipping[0][0] = "Express";
        Shipping[0][1] = "2-3 Days";
        Shipping[0][2] = "$15.99";

        Shipping[1][0] = "Standard";
        Shipping[1][1] = "5-7 Days";
        Shipping[1][2] = "$10.99";

        Shipping[2][0] = " Overnight";
        Shipping[2][1] = "1 Day";
        Shipping[2][2] = "$20.99";

        Shipping[3][0] = "Any day";
        Shipping[3][1] = "10-12 Days";
        Shipping[3][2] = "Free";


        int rows = 4;
        int columns = 3;
        int i, j;

        System.out.println("| Shipping Type | Days | Price |");
        System.out.println("----------------------------------");

        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                System.out.print(Shipping[i][j] + " | ");
            }
            System.out.println();
            System.out.println("----------------------------------");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Which shipping would you like? 1 for Express, 2 for Standard, 3 for Overnight and, 4 for Any Day");
        String whichshoe = sc.next();

        int shipping = 1;
        switch (shipping) {
            case 1:
                System.out.println("Express: $15.99");
                break;
            case 2:
                System.out.println("Standard: $10.99");
                break;
            case 3:
                System.out.println("Overnight: $20.99");
                break;
            case 4:
                System.out.println("Any Day: Free");
                break;
        }

        System.out.println("----------Address!----------");

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Please enter your address:");
        String addy = sc2.next();
        System.out.println("Enter your City:");
        String city = sc2.next();
        System.out.println("Enter your State:");
        String state = sc2.next();
        System.out.println("Enter your zipcode");
        String zip = sc2.next();




        System.out.println("----------Payment!----------");


    }


}
