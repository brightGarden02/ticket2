package com.object1_ex1.ticket2;

public class Bag {

    private int money;
    private Invitation invitation;

    private int hasTicketNumbers;

//    private Ticket ticket;


    public int getTicketNumbers() {
        return hasTicketNumbers;
    }

    public void setTicketNumbers(int hasTicketNumbers) {
        this.hasTicketNumbers = hasTicketNumbers;
    }


    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

}
