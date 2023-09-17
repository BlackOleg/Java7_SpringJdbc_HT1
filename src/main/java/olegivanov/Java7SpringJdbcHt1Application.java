package olegivanov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootApplication
public class Java7SpringJdbcHt1Application {

    public static void main(String[] args) {
        SpringApplication.run(Java7SpringJdbcHt1Application.class, args);

//        jdbcTemplate.update(sqlCust,"Max","Miximov",30,"89001283034");
    }


}
