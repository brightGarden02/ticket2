package com.object1_ex1.ticket2;

public class Audience {

    private TicketOffice ticketOffice;
    private Bag bag;
    private int money;
    private int hasTicketNumbers;

    public int getHasTicketNumbers() {
        return hasTicketNumbers;
    }

    public void setHasTicketNumbers(int hasTicketNumbers) {
        this.hasTicketNumbers = hasTicketNumbers;
    }

    public Audience(TicketOffice ticketOffice, Bag bag, int hasTicketNumbers, int money) {
        this.ticketOffice = ticketOffice;
        this.bag = bag;
        this.hasTicketNumbers = hasTicketNumbers;
        this.money = money;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }

    public void setTicketOffice(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public Bag getBag() {
        return bag;
    }

    public void setBag(Bag bag) {
        this.bag = bag;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    public boolean hasTicket() {
        return hasTicketNumbers != 0;
    }

    //audience가 ticketOffice에 방문한다.
    public void enter(TicketOffice ticketOffice) {

    }
}
