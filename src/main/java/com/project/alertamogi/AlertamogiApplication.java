package com.project.alertamogi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AlertamogiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlertamogiApplication.class, args);
	}

}
