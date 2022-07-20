## 공연 관람을 위한 Ticketing 코드입니다.

#### [책: 오브젝트 코드로 이해하는 객체지향 설계, 저자 조영호님] 챕터1을 다루고 있습니다. 
<br/>

#### 시나리오
#### 1. audience가 Theater에 방문한다.
#### 2. audience가 Theater에서 ticketOffice로 이동한다.
#### 3. audience가 ticketOffice에서 ticketSeller에게 간다.
#### 4. TicketSeller는 audience가 invitation이 있는지 없는지 확인한다.
#### 5. audience가 invitation이 있으면 ticket과 교환해주고 invitation이 없으면 ticket을 판매한다.
<br/><br/>

##### 구성: 7개의 Class: Audience, Bag, Invitation, Ticket, TicketSeller, TicketOffice, Theater
<br/>

##### 1) Audience 클래스 역할: 소지품을 보관하기 위한 가방(Bag)를 소지한다.
##### 2) Bag 클래스 역할: audience가 가지고 있는 돈, 초대장, 티켓(ticket)을 가지고 있다.
##### 3) Invitation 클래스 역할: 공연 관람할 수 있는 초대일자(when) 인스턴스 변수를 가진다.
##### 4) Ticket 클래스 역할: audience는 티켓(ticket)을 소지해야 공연 관람이 가능하다.
##### 5) TicketSeller 클래스 역할: TicketOffice에서 audience에게 티켓(ticket)을 교환해준다, TicketOffice에서 audience에게 티켓(ticket)을 판매한다.
##### 6) TicketOffice 역할: audience에게 판매한 티켓(ticket) 개수를 보관힌다, 티켓(ticket) 금액 보관한다.
##### 7) Theater 클래스 역할: audience가 Theater에 입장한다, TicketSeller가 audience가 invitation이 있는지 없는지 확인한다.
