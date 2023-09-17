CREATE SCHEMA IF NOT EXISTS myhometask;
CREATE table IF NOT EXISTS myhometask.customers
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

CREATE table IF NOT EXISTS myhometask.orders
(
    id           serial PRIMARY KEY,
    date         DATE        NOT NULL,
    customer_id  INT         NOT NULL,
    product_name VARCHAR(50) NOT NULL,
    amount       INT         NOT null,
    FOREIGN KEY (customer_id) REFERENCES myhometask.customers (id)
);

insert into myhometask.orders (date,  customer_id , product_name, amount)
values ('2023-09-01',1,'Pepsi',1);
insert into myhometask.orders (date,  customer_id , product_name, amount)
values ('2023-09-02',4,'Wine',1);
insert into myhometask.orders (date,  customer_id , product_name, amount)
values ('2023-09-02',4,'Cheese',2);
insert into myhometask.orders (date,  customer_id , product_name, amount)
values ('2023-09-01',1,'Bread',4);
insert into myhometask.orders (date,  customer_id , product_name, amount)
values ('2023-09-01',1,'Milk',4);