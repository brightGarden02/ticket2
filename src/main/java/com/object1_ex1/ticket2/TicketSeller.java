package com.object1_ex1.ticket2;

public class TicketSeller {

    private Ticket ticket;

    // audience가 교환권이 있으면 ticketSeller에게 ticket 교환을 시도한다.
    public void changeInvitationToTicket(Audience audience) {

        if(audience.hasTicket()){
            if(ticket.getAmount() > 0){

                changeInvitation(audience);
            }
            else{
                System.out.println("남아 있는 티켓이 없습니다.");
            }
        }
        else{
            return;
        }

    }

    private void changeInvitation(Audience audience) {

        int leftTicket = ticket.getAmount();
        leftTicket--;
        ticket.setAmount(leftTicket);

        int audienceHasTickets = audience.getHasTicketNumbers();
        audienceHasTickets++;
        audience.setHasTicketNumbers(audienceHasTickets);

    }



    // audience가 교환권이 없으면 ticketSeller에게 ticket 구매를 시도한다.
    // ticket 구매 돈이 있으면 ticket을 구매한다.
    // ticket 구매할 돈이 없으면 ticket을 구매하지 못한다.
    private void sellTicket(Audience audience) {

        if(audience.getMoney() >= ticket.getPrice()){

            int leftTicket = ticket.getAmount();
            leftTicket--;
            ticket.setAmount(leftTicket);

            int audienceHasMoney = audience.getMoney();
            audience.setMoney(audienceHasMoney - ticket.getPrice());

            int audienceHasTickets = audience.getHasTicketNumbers();
            audienceHasTickets++;
            audience.setHasTicketNumbers(audienceHasTickets);
        }

    }


    // audience가 교환권이 없으면 ticketSeller에게 ticket 구매를 시도한다.
    public void noInvitationSellTicket(Audience audience) {

        if(ticket.getAmount() > 0){
            sellTicket(audience);
        }
        else{
            System.out.println("남아 있는 티켓이 없습니다.");
        }

    }

}
