package com.xworkz.booking;

public class TrainTicketBooking implements TicketBooking {

    @Override
    public double buy(int quantity) {
        return quantity;
    }

    @Override
    public boolean cancel() {
        return true;
    }
}
