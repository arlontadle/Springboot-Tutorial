package com.springboot.tutorial;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author arlund
 */
@SpringBootApplication(scanBasePackages = "com.springboot.tutorial")
@Slf4j
public class SpringbootTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTutorialApplication.class, args);
		log.info("My Application is now running!. . .");
	}

}
