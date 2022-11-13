package com.sonarqube.example.sq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SqApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqApplication.class, args);
	}

}

//mvn clean verify sonar:sonar -Dsonar.projectKey=sq -Dsonar.host.url=http://localhost:9000 -Dsonar.login=sqp_9223f939064939b81bfbd5fb783f1eb73226fe75