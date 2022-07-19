# 공연 관람을 위한 Ticketing 코드입니다.

#### [책: 오브젝트 코드로 이해하는 객체지향 설계, 저자 조영호님] 챕터1을 다루고 있습니다. 

#### 7개의 class로 이루어져있습니다.
#### class: Audience, Bag, Invitation, Ticket, TicketSeller, TicketOffice, Theater

#### 1) Audience 클래스 역할
##### 1. 소지품을 보관하기 위한 가방(Bag)를 소지한다.
#### 
#### 2) Bag 클래스 역할
##### 1. audience가 가지고 있는 돈, 초대장, 티켓수를 가지고 있다.
####
#### 3) Invitation 클래스 역할
##### 1. 공연 관람할 수 있는 초대일자(when) 인스턴스 변수를 가진다.
#### 
#### 4) Theater 클래스 역할
##### 1. audience가 Theater에 입장한다.
##### 2. TicketSeller가 audience가 invitation이 있는지 없는지 확인한다.
####
#### 5) Ticket 클래스 역할
##### 1. audience는 Ticket을 소지해야 공연 관람이 가능하다.
####
#### 6) TicketOffice 역할
##### 1. audience에게 판매한 티켓 개수를 보관힌다.
##### 2. 티켓 금액 보관한다.
####
#### 7) TicketSeller 클래스 역할
##### 1. TicketOffice에서 audience에게 ticket을 교환해준다.
##### 2. TicketOffice에서 audience에게 ticket을 판매한다.

