package com.object1_ex1.ticket2;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ticket2Application {

	public static void main(String[] args) {
//		SpringApplication.run(Ticket2Application.class, args);

		Ticket ticket = new Ticket();
		TicketOffice ticketOffice = new TicketOffice(ticket);
		Bag bag = new Bag();
		Audience audience = new Audience(bag);
		TicketSeller ticketSeller = new TicketSeller(ticketOffice);
		Theater theater = new Theater(ticketSeller);

		// audience가 Theater에 방문한다.
		theater.enter(audience);

		// audience가 Theater에서 ticketOffice로 이동한다.
		// audience가 ticketOffice에서 ticketSeller에게 간다.

		// TicketSeller는 audience가 invitation이 있는지 없는지 확인한다.
		ticketSeller.hasInvitationOrNot(audience);

	}
}
