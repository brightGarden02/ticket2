# 공연 관람을 위한 Ticketing 코드입니다.
#### [책: 오브젝트 코드로 이해하는 객체지향 설계, 저자 조영호님] 챕터1을 다루고 있습니다. 
<br/>

## 시나리오
### 1. Audience가 Theater에 방문한다.
### 2. Audience가 Theater에서 TicketOffice로 이동한다.
### 3. Audience가 TicketOffice에서 TicketSeller에게 간다.
### 4. TicketSeller는 Audience가 Invitation이 있는지 없는지 확인한다.
### 5. Audience가 Invitation이 있으면 Ticket과 교환해주고 Invitation이 없으면 Ticket을 판매한다.
<br/><br/>


### 클래스 7개의 역할
#### 1. Audience: 소지품을 보관하기 위한 가방(Bag)를 소지한다.
#### 2. Bag: Audience가 가지고 있는 돈, 초대장, 티켓(Ticket)을 가지고 있다.
#### 3. Invitation: 공연 관람할 수 있는 초대일자(when) 인스턴스 변수를 가진다.
#### 4. Ticket: Audience는 티켓(Ticket)을 소지해야 공연 관람이 가능하다.
#### 5. TicketSeller: TicketOffice에서 Audience에게 티켓(Ticket)을 교환해준다, TicketOffice에서 Audience에게 티켓(Ticket)을 판매한다.
#### 6. TicketOffice: Audience에게 판매한 티켓(Ticket) 개수를 보관힌다, 티켓(Ticket) 금액 보관한다.
#### 7. Theater: Audience가 Theater에 입장한다. TicketSeller는 Audience가 Invitation이 있는지 없는지 확인한다.
