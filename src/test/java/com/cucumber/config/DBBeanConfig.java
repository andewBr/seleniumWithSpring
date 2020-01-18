package com.cucumber.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

public class DBBeanConfig {
    @Autowired
    private Environment env;
    @Bean
    public DataSource dataSourceDgrWebapp() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getRequiredProperty("spring.datasource.driver-class-name.dgr_ip"));
        dataSource.setUrl(env.getRequiredProperty("spring.datasource.url.dgr_ip"));
        dataSource.setUsername(env.getRequiredProperty("spring.datasource.username.dgr_ip"));
        dataSource.setPassword(env.getRequiredProperty("spring.datasource.password.dgr_ip"));
        return dataSource;
    }
    @Qualifier("jdbcTemplate1")
    @Bean
    public JdbcTemplate jdbcTemplateDgrWebapp() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSourceDgrWebapp());
        jdbcTemplate.setResultsMapCaseInsensitive(true);
        return jdbcTemplate;
    }

}
