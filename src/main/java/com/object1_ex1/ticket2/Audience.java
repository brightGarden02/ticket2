package com.object1_ex1.ticket2;

/**
 * Audience 클래스 역할
 * 1. 소지품을 보관하기 위한 가방(Bag)를 소지한다.
 */
public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }

}