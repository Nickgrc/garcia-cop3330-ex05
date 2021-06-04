import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nickolas Garcia
 */



public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the first number?" );
        String num1 = in.nextLine();

        System.out.print("What is the second number?" );
        String num2 = in.nextLine();

        String Sum1 = num1 + " + " + num2;
        String Sum2 = num1 + " - " + num2;
        String Sum3 = num1 + " * " + num2;
        String Sum4 = num1 + " / " + num2;

        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int quot = a / b;

        System.out.print(Sum1 + " = " + sum + "\n" + Sum2 + " = " + diff + "\n"
                + Sum3 + " = " + prod + "\n" + Sum4 + " = " + quot);

    }





}
