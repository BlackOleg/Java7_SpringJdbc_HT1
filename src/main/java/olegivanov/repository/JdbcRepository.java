package olegivanov.repository;

import olegivanov.model.Customers;
import olegivanov.model.Orders;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class JdbcRepository {
    NamedParameterJdbcTemplate template;

    public JdbcRepository(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    public void saveCustomers(Customers c) {
        String sqlCust = "insert into myhometask.customers (name, surname, age, phone_number)" +
                " values (:name,:surname,:age,:phone)";
        Map<String, Object> params = new HashMap<>();
        params.put("name", c.getName());
        params.put("surname", c.getSurname());
        params.put("age", c.getAge());
        params.put("phone", c.getPhone_number());
        template.update(sqlCust, params);
    }

    public void saveOrders(Orders o) {
        String sqlOrd = "insert into myhometask.orders (date,  customer_id , product_name, amount)" +
                " values (:date,:customerId,:productName,:amount)";
        Map<String, Object> params = new HashMap<>();
        params.put("date", o.getDate());
        params.put("customerId",o.getCustomer_id() );
        params.put("productName", o.getProduct_name());
        params.put("amount", o.getAmount());
        template.update(sqlOrd, params);
    }

    public List<String> getProductsByName(String name) {
        String sql = read("products_query.sql");
        Map<String, Object> params = new HashMap<>();
        params.put("name", name);
        return Collections.singletonList(this.template.queryForList(sql, params, String.class).toString());
    }

    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
