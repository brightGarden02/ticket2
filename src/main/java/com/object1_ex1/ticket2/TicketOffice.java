package com.object1_ex1.ticket2;

/**
 * TicketOffice 역할
 * 1. audience에게 판매한 티켓 개수를 보관힌다.
 * 2. 티켓 금액 보관한다.
 */
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
