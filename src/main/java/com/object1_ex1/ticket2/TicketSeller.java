package com.object1_ex1.ticket2;

/**
 * TicketSeller 클래스 역할
 * 1. TicketOffice에서 audience에게 ticket을 교환해준다.
 * 2. TicketOffice에서 audience에게 ticket을 판매한다.
 */
public class TicketSeller {
    private TicketOffice ticketOffice;
    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }


    // TicketSeller는 audience가 invitation이 있는지 없는지 확인한다.
    public void hasInvitationOrNot(Audience audience) {

        // audience가 교환권이 있으면
        // ticketSeller가 audience에게 ticket 교환을 시도한다.
        if(audience.getBag().getTicketNumbers() > 0){
            changeInvitationToTicket(audience);
        }
        else{ // audience가 교환권이 없으면
              // ticketSeller가 audicence에게 ticket 판매를 시도한다.
            noInvitationSellTicket(audience);
        }

    }

    private void changeInvitationToTicket(Audience audience) {

        //TicketSeller가 ticketOffice에서 Ticket의 개수를 확인한다.
        Ticket ticket = ticketOffice.getTicket();
        if(ticket.getTicketNumbers() > 0){

            int leftTicket = ticket.getTicketNumbers();
            leftTicket--;
            ticket.setTicketNumbers(leftTicket);

            int audienceHasTickets = audience.getBag().getTicketNumbers();
            audienceHasTickets++;
            audience.getBag().setTicketNumbers(audienceHasTickets);
        }
        else{
            System.out.println("남아 있는 티켓이 없습니다.");
        }

    }


    // audience가 ticket 구매 돈이 있으면 TicketSeller가 ticket을 판매한다.
    // ticket 구매할 돈이 없으면 ticket을 판매하지 못한다.
    private void sellTicket(Audience audience, Ticket ticket) {


        if(audience.getBag().getMoney() >= ticket.getPrice()){

            int leftTicket = ticket.getTicketNumbers();
            leftTicket--;
            ticket.setTicketNumbers(leftTicket);

            int audienceHasMoney = audience.getBag().getMoney();
            audience.getBag().setMoney(audienceHasMoney - ticket.getPrice());



            int audienceHasTickets = audience.getBag().getTicketNumbers();
            audienceHasTickets++;
            audience.getBag().setTicketNumbers(audienceHasTickets);
        }
        else{
            System.out.println("audience가 ticket을 구매할 금액이 없습니다.");
        }

    }


    // audience가 교환권이 없으면
    // ticketSeller가 audicence에게 ticket 판매를 시도한다.
    private void noInvitationSellTicket(Audience audience) {

        //TicketSeller가 ticketOffice에서 Ticket의 개수를 확인한다.
        Ticket ticket = ticketOffice.getTicket();

        if(ticket.getTicketNumbers() > 0){
            sellTicket(audience, ticket);
        }
        else{
            System.out.println("남아 있는 티켓이 없습니다.");
        }

    }

}
