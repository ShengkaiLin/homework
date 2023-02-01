package com.train;

import java.util.Arrays;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int endBuyFlowCode = 0;

        while (endBuyFlowCode != -1) {
            System.out.println("How many tickets do you want to buy:");
            int totalTickets = scanner.nextInt();

            System.out.println("How many round-trip tickets do you want to buy?");
            int roundTripTickets = scanner.nextInt();

            System.out.println("The following is your ticket details:");
            Conductor conductor = new Conductor(totalTickets, roundTripTickets);
            conductor.showTransactionInfo();

            System.out.println("If you want to stop buying ticket , you can input number -1 or not:");
            endBuyFlowCode = scanner.nextInt();
        }

    }
}
