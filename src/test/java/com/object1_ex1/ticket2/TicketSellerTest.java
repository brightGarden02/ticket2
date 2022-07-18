package com.object1_ex1.ticket2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class TicketSellerTest {


    //audience가 ticket이 없고 교환권이 있으면 ticketSeller에게 ticket 교환을 시도한다.
    @Test
    public void invitationChangeToTicket() {

        //given
        TicketOffice ticketOffice = new TicketOffice();
         Bag bag = new Bag();
         int hasTicketNumbers = 0;
        int money = 5;

        int ticketAmount = 2;
        int ticketPrice = 1;
        Ticket ticket = new Ticket(ticketAmount, ticketPrice);

        Audience audience = new Audience(ticketOffice, bag, hasTicketNumbers, money);

        //when
        if(audience.hasTicket()){
            if(ticket.getAmount() > 0){

                if(audience.getMoney() >= ticket.getPrice()){

                    int leftTicket = ticket.getAmount();
                    leftTicket--;
                    ticket.setAmount(leftTicket);

                    int audienceHasTickets = audience.getTicketNumbers();
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

        //then
        Assertions.assertThat(audience.getTicketNumbers()).isEqualTo(1);

    }
}