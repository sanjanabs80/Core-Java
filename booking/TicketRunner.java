package com.xworkz.booking;

public class TicketRunner {
    public static void main(String[] args) {
        TicketBooking ticketBooking=new TrainTicketBooking();
        Theater theater=new Theater(ticketBooking);
        theater.sell(5);
        theater.cancel();







    }
}
