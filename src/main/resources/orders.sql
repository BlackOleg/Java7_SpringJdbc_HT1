CREATE table myhometask.orders
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