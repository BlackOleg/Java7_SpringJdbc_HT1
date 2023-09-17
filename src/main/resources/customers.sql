create schema myhometask;
CREATE table myhometask.customers
(
    id           serial PRIMARY KEY,
    name         VARCHAR(20) not NULL,
    surname      VARCHAR(50) not NULL,
    age          INT         not NULL,
    phone_number VARCHAR(11),
    CHECK (age > 18 AND age < 100)
);

insert into myhometask.customers (name, surname, age, phone_number)
values ('Max','Miximov',30,'89001283034');
insert into myhometask.customers (name, surname, age, phone_number)
values ('Boris','Valeev',48,'89001283036');
insert into myhometask.customers (name, surname, age, phone_number)
values ('Kim','Hakimov',33,'89001283035');
insert into myhometask.customers (name, surname, age, phone_number)
values ('Alexey','Hakimov',21,'89001283035');