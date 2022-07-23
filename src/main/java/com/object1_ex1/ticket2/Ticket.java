package com.object1_ex1.ticket2;


/**
 * Ticket 클래스 역할
 * 1. audience는 Ticket을 소지해야 공연 관람이 가능하다.
 */
public class Ticket {

    private int ticketNumbers;
    private int price;

    public Ticket(int ticketNumbers, int price) {
        this.ticketNumbers = ticketNumbers;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getTicketNumbers() {
        return ticketNumbers;
    }

    public void setTicketNumbers(int ticketNumbers) {
        this.ticketNumbers = ticketNumbers;
    }
}
