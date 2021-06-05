/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rafael Nieves
 */

package org.example;

import java.util.Scanner;

public class CarIssues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? ");
        String keyString = input.nextLine();

        if (keyString.equals("yes") || keyString.equals("Yes")) {
            System.out.print("Are the battery terminals corroded? ");
            String batteryString = input.nextLine();

            if (batteryString.equals("yes") || batteryString.equals("Yes")) {
                System.out.println("Clean terminals and try starting again.");
            }
            else{
                System.out.println("Replace cables and try again.");
            }
        }
        else {
            System.out.print("Does the car make a slicking noise? ");
            String noiseString = input.nextLine();

            if (noiseString.equals("yes") || noiseString.equals("Yes")) {
                System.out.println("Replace the battery.");
            }
            else {
                System.out.print("Does the car crank up but fail to start? ");
                String crankString = input.nextLine();

                if (crankString.equals("yes") || crankString.equals("Yes")) {
                    System.out.println("Check spark plug connections.");
                }
                else {
                    System.out.print("Does the engine start and then die? ");
                    String dieString = input.nextLine();

                    if (dieString.equals("yes") || dieString.equals("Yes")) {
                        System.out.print("Does your car have fuel injection? ");
                        String injectionString = input.nextLine();

                        if (injectionString.equals("yes") || injectionString.equals("Yes")) {
                            System.out.println("Get it in for service.");
                        }
                        else {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}
