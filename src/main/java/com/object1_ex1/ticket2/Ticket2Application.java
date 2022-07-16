package com.object1_ex1.ticket2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ticket2Application {

	public static void main(String[] args) {
//		SpringApplication.run(Ticket2Application.class, args);

		Audience audience = new Audience();
		TicketSeller ticketSeller = new TicketSeller();
		TicketOffice ticketOffice = new TicketOffice();

		//audience가 ticketOffice에 방문한다.


		//audience가 ticketOffice에서 ticketSeller에게 간다.


		//audience가 ticket이 없고 교환권이 있으면 ticketSeller에게 ticket 교환을 시도한다.


		//audience가 ticket이 없고 교환권이 없으면 ticketSeller에게 ticket 구매를 시도한다.
		// ticket 구매 돈이 있으면 ticket을 구매한다.
		// ticket 구매할 돈이 없으면 ticket을 구매하지 못한다.

	}
}
