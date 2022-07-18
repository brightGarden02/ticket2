package com.object1_ex1.ticket2;

/**
 * Theater 클래스 역할
 * 1. audience가 Theater에 입장한다.
 * 2. TicketSeller가 audience가 invitation이 있는지 없는지 확인한다.
 */
public class Theater {

    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }


    // audience가 Theater에 방문한다.
    public void enter(Audience audience) {
        ticketSeller.hasInvitationOrNot(audience);
    }

}
