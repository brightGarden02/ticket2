package com.object1_ex1.ticket2;

import java.util.List;

public class Audience {

    private TicketOffice ticketOffice;
    private Bag bag;
//    private Ticket ticket;
    private List<Ticket> ticketList;
    private int money;
    private int hasTicketNumbers;

    public int getHasTicketNumbers() {
        return hasTicketNumbers;
    }

    public void setHasTicketNumbers(int hasTicketNumbers) {
        this.hasTicketNumbers = hasTicketNumbers;
    }

    public Audience(TicketOffice ticketOffice, Bag bag, int tickets, List<Ticket> ticketList, int amount) {
        this.ticketOffice = ticketOffice;
        this.bag = bag;
        this.hasTicketNumbers = tickets;
        this.ticketList = ticketList;
        this.money = amount;
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

//    public Ticket getTicket() {
//        return ticket;
//    }
//
//    public void setTicket(Ticket ticket) {
//        this.ticket = ticket;
//    }

    public List<Ticket> getTicketList() {
        return ticketList;
    }

    public void setTicketList(List<Ticket> ticketList) {
        this.ticketList = ticketList;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    //audience가 ticketOffice에 방문한다.
    public void enter(TicketOffice ticketOffice) {

    }

    public boolean hasTicket() {
        return ticketList.size() != 0;
    }
}
