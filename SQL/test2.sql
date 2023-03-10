-- [작성한 SQL]

-- BRANDS 테이블 생성

CREATE TABLE BRANDS(

BRAND_ID NUMBER PRIMARY KEY,

BRAND_NAME VARCHAR2(100) NOT NULL

);

-- PRODUCTS 테이블 생성

CREATE TABLE PRODUCTS(

PRODUCT_NO NUMBER PRIMARY KEY,

PRODUCT_NAME VARCHAR2(50) NOT NULL,

PRODUCT_PRICE NUMBER NOT NULL,

BRAND_CODE NUMBER REFERENCES BRANDS,

serial_no varchar2(100),

SOLD_OUT CHAR(1) DEFAULT 'N' CHECK(SOLD_OUT IN ('Y', 'N'))

);
alter table products modify product_name varchar2(20);
-- SEQ_BRAND_ID 시퀀스 생성



CREATE SEQUENCE SEQ_BRAND_ID

START WITH 100

INCREMENT BY 100

MAXVALUE 500

NOCYCLE;

-- SEQ_PRODUCT_NO 시퀀스 생성

CREATE SEQUENCE SEQ_PRODUCT_NO

START WITH 1

INCREMENT BY 1

MAXVALUE 10000



NOCYCLE;
drop table products;
-- BRANDS 테이블 데이터 삽입

INSERT INTO BRANDS VALUES (SEQ_BRAND_ID.NEXTVAL, '삼성');

INSERT INTO BRANDS VALUES (SEQ_BRAND_ID.CURRVAL, '애플');

alter sequence SEQ_BRAND_ID maxvalue 1000; 
alter table products add (serial_no varchar2(100));
-- PRODUCTS 테이블 데이터 삽입
desc products;
INSERT INTO PRODUCTS VALUES (SEQ_PRODUCT_NO.NEXTVAL, '갤럭시S8', 800000, 100,'S8','Y' );

INSERT INTO PRODUCTS VALUES (SEQ_PRODUCT_NO.NEXTVAL, '갤럭시S9', 900000, 100, 'S9','N');

INSERT INTO PRODUCTS VALUES (SEQ_PRODUCT_NO.NEXTVAL, '갤럭시S10', 1000000, 100, 'S10','N');

INSERT INTO PRODUCTS VALUES (SEQ_PRODUCT_NO.NEXTVAL, '아이폰9S', 900000, 200, '9S','N');

INSERT INTO PRODUCTS VALUES (SEQ_PRODUCT_NO.NEXTVAL, '아이폰10S', 1000000, 200, '10S','N');

-- 결과 조회

SELECT PRODUCT_NAME, PRODUCT_PRICE, SOLD_OUT

FROM PRODUCTS JOIN BRANDS ON (BRAND_ID = BRAND_CODE);