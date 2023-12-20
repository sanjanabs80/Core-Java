package com.xworkz.booking;

public class Theater {
   private TicketBooking ticketBooking;
   double price;

    Theater(TicketBooking ticketBooking) {
        this.ticketBooking = ticketBooking;
    }


    public double sell(int quantity) {
        System.out.println("ticket selling in theater:"+quantity);
        double discount=quantity*0.1;
        double totalAmt=quantity-discount;
        price=200*totalAmt;
        if(quantity>=5) {
            double quan = this.ticketBooking.buy(quantity);

            System.out.println("discount amount:"+price);
        }
        return price;

         }



    public void cancel() {
        System.out.println("cancel ticket in theater");
        boolean canceled = this.ticketBooking.cancel();
    }
}



