create table person
(
   id integer not null,
   name varchar(255) not null,
   location varchar(255),
   birth_date varchar(255),
   primary key(id)
);
 
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10001,  'Ranga', 'Hyderabad','21-05-1998');
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10002,  'James', 'New York', '14-09-1997');
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10003,  'Pieter', 'Amsterdam','14-07-1997');
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10006,  'Jhon', 'Kolkatta','14-07-1947');
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10008,  'cena', 'Mangalore','14-07-1980');