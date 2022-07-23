package com.object1_ex1.ticket2;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ticket2Application {

	public static void main(String[] args) {
//		SpringApplication.run(Ticket2Application.class, args);

		Ticket ticket = new Ticket(2, 12000);
		TicketOffice ticketOffice = new TicketOffice(ticket);
		TicketSeller ticketSeller = new TicketSeller(ticketOffice);
		Theater theater = new Theater(ticketSeller);

		Invitation invitation = new Invitation();

		// audience는 가방을 가지고 있다.
		Bag bag = new Bag(20000, invitation,0);
		Audience audience = new Audience(bag);

		System.out.println("before change invitation to ticket");
		System.out.println("audienceMoney: " +  audience.getBag().getMoney() + ", audienceTicket: " + audience.getBag().getTicketNumbers());

		// audience가 Theater에 방문한다.
		theater.enter(audience);

		// audience가 Theater에서 ticketOffice로 이동한다.
		// audience가 ticketOffice에서 ticketSeller에게 간다.
		// TicketSeller는 audience가 invitation이 있는지 없는지 확인한다.

		System.out.println();
		System.out.println("after change invitation to ticket");
		System.out.println("audienceMoney: " +  audience.getBag().getMoney() + ", audienceTicket: " + audience.getBag().getTicketNumbers());
	}
}
