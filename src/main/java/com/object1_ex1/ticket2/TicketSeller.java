package com.object1_ex1.ticket2;

public class TicketSeller {

    private Ticket ticket;

    //audience가 ticket이 없고 교환권이 있으면 ticketSeller에게 ticket 교환을 시도한다.
    public void change(Audience audience) {

        if(audience.hasTicket()){
            if(ticket.getAmount() > 0){

                if(audience.getMoney() >= ticket.getPrice()){

                    int leftTicket = ticket.getAmount();
                    leftTicket--;
                    ticket.setAmount(leftTicket);

                    int audienceHasTickets = audience.getHasTicketNumbers();
                    audienceHasTickets++;
                    audience.setHasTicketNumbers(audienceHasTickets);

                }
            }
            else{
                System.out.println("남아 있는 티켓이 없습니다.");
            }

        }
        else{
            return;
        }

    }


    //audience가 ticket이 없고 교환권이 없으면 ticketSeller에게 ticket 구매를 시도한다.
    // ticket 구매 돈이 있으면 ticket을 구매한다.
    // ticket 구매할 돈이 없으면 ticket을 구매하지 못한다.
    public void sell(boolean hasTicket) {


    }

}
