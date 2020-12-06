package com.company;

import java.util.Scanner;

class payment {
    public payment() {
        System.out.println("Your total is $127.99 + $15.99");
    }

    public payment(String one) {
        this();
        System.out.println("Your subtotal is: $143.98 ");
    }

    public payment(String one, int num) {
        this(one);
        System.out.println("Your total is $143.98 + 10% tax");
    }

    public payment(int num1, int num2, int num3) {
        this("this is a string", num1);
        System.out.println("Tax is $14.40");
        double num = 143.98 + 14.40;
        System.out.println("Your total is: " + num);

        System.out.println("----------Card Information!----------");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your card first and last name:");
        String cardname = sc.next();
        System.out.println("Please enter your card number in xxxx-xxxx-xxxx-xxxx form:");
        String cardnum = sc.next();
        System.out.println("Please enter your card expiration date:");
        String cardexp = sc.next();
        System.out.println("Please enter your card CVV");
        String cardcvv = sc.next();
        System.out.println("Your order has processed!");

        System.out.println("----------------------------------");
        System.out.println("THANK YOU FOR SHOPPING WITH US <3");



    }
