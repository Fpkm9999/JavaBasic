#회원등록 테이블
CREATE TABLE member
(
#자동증가정수, 아이디, 이름, 나이, 거주지
    memberId int AUTO_INCREMENT PRIMARY KEY, #자동증가 #중복 불가
    userId   VARCHAR(20) NOT NULL,           #유저아이디
    name     VARCHAR(20) NOT NULL,           #유저이름
    age      INT(3)      NOT NULL,           #유저나이
    addr     VARCHAR(20) NOT NULL            #유저거주지
);
# userid는 Unique 걸어 놓지 않았음
# 로직에서 중복검사를 돌리기 떄문에

CREATE TABLE account
(
    memberid      INT PRIMARY KEY,                                                  # 유저아이디
    accountType   INT           NOT NULL CHECK (accountType = 1 or accountType = 2),# (1 : 예금계좌, 2 : 대출계좌)
    accountNumber INT           NOT NULL,                                           # 계좌 번호
    balance       DECIMAL(10, 2),                                                   # 잔액
    typeRate      DECIMAL(5, 2) NULL,                                               # 이자율/ 수수료율
    CONSTRAINT fk_m
        FOREIGN KEY (memberid) REFERENCES member (memberid)
);

<<<<<<< HEAD
INSERT INTO member VALUES (0, 'test', 'test', 25, 'test');   # memberid : 1번
insert into member values (2,'test1','test1',26,'addrtest'); # memberid : 2번
insert into account values (2,1,3033,10000,0.5);

select * from member where userId='test';

SELECT * FROM member;
SELECT * FROM ACCOUNT;
SELECT * FROM member WHERE userid = 'test';

select count(userId) from member where userId='test';


select * from member where memberId=(
select memberId from member where memberId=2);

select memberId from member where memberId=2;

select count(accountType) from account where memberid= (
select memberId from member where userId='test');


select * from account where memberid= (
SELECT member.memberId FROM member WHERE userid = 'test1');
=======
# 테스트 (중복검사 관련 ) 
INSERT INTO member
VALUES (0, 'test', 'test', 25, 'test');
SELECT *
FROM member;
SELECT *
FROM ACCOUNT;
SELECT *
FROM member
WHERE userid = 'test';
>>>>>>> 0ef9cbcdf5b5a66e02cd5268c10c517b6e375b2a

INSERT INTO ACCOUNT
VALUES ((SELECT memberid FROM member WHERE userid = 'test'), 1, 3355, 1000, 0.5);
SELECT *
FROM member
WHERE memberid = (SELECT memberid
                  FROM ACCOUNT
                  WHERE accountNumber = 3355);

<<<<<<< HEAD
# CREATE TABLE accountHistory
# (
# #회원테이블의 아이디
# #account 테이블의 계좌번호 원금, 이자, 수수료, 거래금액, 거래당시금액
#     accountNumber INT            NOT NULL, #계좌번호
#     balance       DECIMAL(10, 2) NOT NULL, #입,출금 때 사용할 거
#     amount        DECIMAL(10, 2) NOT NULL  #거래당시 초기 금액
# );
=======
# 테스트 중인거 
CREATE TABLE accountHistory
(
#회원테이블의 아이디
#account 테이블의 계좌번호 원금, 이자, 수수료, 거래금액, 거래당시금액
    accountNumber INT            NOT NULL, #계좌번호
    balance       DECIMAL(10, 2) NOT NULL, #입,출금 때 사용할 거
    amount        DECIMAL(10, 2) NOT NULL  #거래당시 초기 금액
);
>>>>>>> 0ef9cbcdf5b5a66e02cd5268c10c517b6e375b2a


# 이건 정상
create table accountHistory
(
    accountHistoryId   int auto_increment primary key, # 거래내역 일련번호
#     memberId         int not null,
    transactionType    int            not null,        # 거래유형
    accountNumber      int            not null,        # 계좌일련번호
    Transaction_amount DECIMAL(12, 2) NOT NULL,        # 거래금액

    CONSTRAINT UNIQUE_AH unique (transactionType, accountNumber),
#     foreign key (memberId) references member (memberId), # accountId가 이미 account 테이블 -> member와 연결외어 있어서 의미 없음
    foreign key (accountNumber) references account (accountNumber)
);
