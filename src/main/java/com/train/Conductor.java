package com.train;

public class Conductor {

    private int totalTickets;
    private int roundTripTickets;
    private final int singleTicketPrice = 1000;

    public Conductor(int totalTickets, int roundTripTickets) {
        this.totalTickets = totalTickets;
        this.roundTripTickets = roundTripTickets;
    }

    public void showTransactionInfo() {
        int fullTickets = totalTickets - roundTripTickets;
        int totalPrice = (int) (singleTicketPrice * fullTickets + singleTicketPrice * 2 * roundTripTickets * 0.9);

        System.out.printf("Total Tickets:%d \n Round-trip:%d \n Total:%d \n", totalTickets, roundTripTickets, totalPrice);

    }
}
