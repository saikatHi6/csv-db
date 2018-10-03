package org.atom.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CsvToDbJobApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsvToDbJobApplication.class, args);
	}
}
