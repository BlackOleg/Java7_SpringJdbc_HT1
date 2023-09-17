package olegivanov.service;

import olegivanov.repository.JdbcRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebService {

        private final JdbcRepository jdbcRepository;

        public WebService(JdbcRepository jdbcRepository) {
            this.jdbcRepository = jdbcRepository;
        }
        public List<String> getProductsByName(String name){

            return jdbcRepository.getProductsByName(name.toLowerCase());
        }


}
