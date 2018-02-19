package com.rte.bob.processing;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import oracle.jdbc.datasource.OracleDataSource;

@SpringBootApplication
public class BobProcessingRteApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(BobProcessingRteApplication.class);

	public static void main(String[] args) {
		LOGGER.info("BobProcessingRteApplication has just started");
		SpringApplication.run(BobProcessingRteApplication.class, args);
	}
	
    @Bean

    DataSource dataSource() throws SQLException {

        OracleDataSource dataSource = new oracle.jdbc.pool.OracleDataSource();

       /* dataSource.setUser(username);

        dataSource.setPassword(password);

        dataSource.setURL(url);

        dataSource.setImplicitCachingEnabled(true);

        dataSource.setFastConnectionFailoverEnabled(true);*/

        return dataSource;

    }
    
}
