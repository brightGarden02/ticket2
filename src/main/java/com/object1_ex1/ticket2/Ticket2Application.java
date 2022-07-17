package com.object1_ex1.ticket2;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ticket2Application {

	public static void main(String[] args) {
//		SpringApplication.run(Ticket2Application.class, args);

		TicketOffice ticketOffice1 = new TicketOffice();
		Bag bag1 = new Bag();
		int hasTicketNumbers = 0;
		int money = 5;

		int ticketAmount = 2;
		int ticketPrice = 1;
		Ticket ticket = new Ticket(ticketAmount, ticketPrice);

		Audience audience = new Audience(ticketOffice1, bag1, hasTicketNumbers, money);

		TicketSeller ticketSeller = new TicketSeller();
		TicketOffice ticketOffice = new TicketOffice();

		//audience가 ticketOffice에 방문한다.
		audience.enter(ticketOffice);


		//audience가 ticketOffice에서 ticketSeller에게 간다.


		// audience가 교환권이 있으면 ticketSeller에게 ticket 교환을 시도한다.
		ticketSeller.invitationChangeToTicket(audience);


		// audience가 교환권이 없으면 ticketSeller에게 ticket 구매를 시도한다.
		// ticket 구매 돈이 있으면 ticket을 구매한다.
		// ticket 구매할 돈이 없으면 ticket을 구매하지 못한다.
		ticketSeller.noInvitationSellTicket(audience);


	}
}
