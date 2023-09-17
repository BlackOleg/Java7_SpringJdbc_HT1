package olegivanov.configuration;


import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Properties;

@Configuration
public class DbConfig {
//    @Value("${spring.datasource.dataSourceClassName}")
//    private String dataSourceClassName;
//    @Value("${spring.datasource.url}")
//    private String dataSourceUrl;
//    @Value("spring.datasource.username}")
//    private String userName;
//    @Value("spring.datasource.password}")
//    private String password;

//    @Bean

//    public DataSource dataSource() throws SQLException  {
////        HikariDataSource dataSource = new HikariDataSource();
////        dataSource.setDriverClassName(dataSourceClassName);
////        dataSource.setJdbcUrl(datasourceUrl);
////        dataSource.setUsername(userName);
////        dataSource.setPassword(password);
////        dataSource.setConnectionTimeout(1000);
////        return dataSource;
//        Properties dsProps = new Properties();
//        dsProps.put("url", dataSourceUrl);
//        dsProps.put("user", userName);
//        dsProps.put("password", password);
//        dsProps.put("prepStmtCacheSize",250);
//        dsProps.put("prepStmtCacheSqlLimit",2048);
//        dsProps.put("cachePrepStmts",Boolean.TRUE);
//        dsProps.put("useServerPrepStmts",Boolean.TRUE);
//
//        Properties configProps = new Properties();
//        configProps.put("dataSourceClassName", dataSourceClassName);
////        configProps.put("poolName","Vector");
//        configProps.put("maximumPoolSize",10);
////        configProps.put("minimumIdle",minimumIdle);
////        configProps.put("minimumIdle",minimumIdle);
//       configProps.put("connectionTimeout", 1000);
////        configProps.put("idleTimeout", idleTimeout);
//        configProps.put("dataSourceProperties", dsProps);
//
//        HikariConfig hc = new HikariConfig(configProps);
//        HikariDataSource ds = new HikariDataSource(hc);
//        return ds;
//
//    }

//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource dataSource() {
//        return DataSourceBuilder.create().build();
//    }
}
