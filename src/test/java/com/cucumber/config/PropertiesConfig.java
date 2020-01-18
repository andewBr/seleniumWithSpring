package com.cucumber.config;

import lombok.Data;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@Data
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(ignoreInvalidFields = true)
@PropertySources({
        @PropertySource(value = "classpath:properties/application-jdbc.properties"),
        @PropertySource(value = "classpath:properties/application-${spring.profiles.active}.properties", ignoreResourceNotFound = true)
})
public class PropertiesConfig {

    private Web web;

    @lombok.Data
    public static class Web {
        private String baseurl;
        private Auth user;
    }

    @lombok.Data
    public static class Auth {
        private String username;
        private String password;
    }

}
