package com.rte.bob.collecting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@EnableBatchProcessing
public class DataImportApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(DataImportApplication.class);
	public static void main(String[] args) {
		LOGGER.info("DataImportApplication has just started");
		SpringApplication.run(DataImportApplication.class, args);
	}
}
