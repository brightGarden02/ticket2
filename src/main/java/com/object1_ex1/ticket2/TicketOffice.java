package com.object1_ex1.ticket2;

public class TicketOffice {

    private Ticket ticket;

    public TicketOffice(Ticket ticket) {
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
