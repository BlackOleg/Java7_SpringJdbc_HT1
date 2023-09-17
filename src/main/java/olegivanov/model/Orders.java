package olegivanov.model;

import lombok.Data;

import java.time.LocalDate;
@Data
public class Orders {
    private LocalDate date;
    private int customer_id;
    private String product_name;
    private int amount;


}
