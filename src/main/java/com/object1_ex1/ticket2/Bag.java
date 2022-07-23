package com.object1_ex1.ticket2;

/**
 * Bag 클래스 역할
 * 1. audience가 가지고 있는 돈, 초대장, 티켓수를 가지고 있다.
 */
public class Bag {

    private int money;
    private Invitation invitation;
    private int hasTicketNumbers;

    public Bag(int money, Invitation invitation, int hasTicketNumbers) {
        this.money = money;
        this.invitation = invitation;
        this.hasTicketNumbers = hasTicketNumbers;
    }

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
