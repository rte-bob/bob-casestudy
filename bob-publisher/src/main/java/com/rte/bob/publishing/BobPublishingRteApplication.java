package com.rte.bob.publishing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BobPublishingRteApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(BobPublishingRteApplication.class);

	public static void main(String[] args) {
		LOGGER.info("BobProcessingRteApplication has just started");
		SpringApplication.run(BobPublishingRteApplication.class, args);
	}
}
