select product_name
from myhometask.orders o
         join myhometask.customers c on
    o.customer_id = c.id and LOWER(c.name) = :name