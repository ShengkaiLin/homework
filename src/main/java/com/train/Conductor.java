package com.train;

public class Conductor {

    private int totalTickets;
    private int roundTripTickets;
    private final int singleTicketPrice = 1000;

    public Conductor(int totalTickets, int roundTripTickets) {
        this.totalTickets = totalTickets;
        this.roundTripTickets = roundTripTickets;
    }

    public void showTransactionInfo(){
        int totalPrice =  singleTicketPrice*(roundTripTickets*0.9 + totalTickets);

        System.out.printf("Total Tickets:%d \n Round-trip:%d \n Total:%d \n",totalTickets,roundTripTickets,totalPrice);

    }
}
