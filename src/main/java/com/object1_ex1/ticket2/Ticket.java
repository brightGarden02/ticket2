package com.object1_ex1.ticket2;


/**
 * Ticket 클래스 역할
 * 1. audience는 Ticket을 소지해야 공연 관람이 가능하다.
 */
public class Ticket {

    private int amount;
    private int price;

    public Ticket(int amount, int price) {
        this.amount = amount;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Ticket(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
