package com.rochaco.pioHealth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

// main class of the application
// por que tuve que hacer esto?
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PioHealthApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(PioHealthApplication.class, args);

		//MyFirstClass myFirstClass = ctx.getBean(MyFirstClass.class);
		MyFirstService myFirstService = ctx.getBean(MyFirstService.class);
		System.out.println(myFirstService.tellStory());
		System.out.println(myFirstService.getCustomProperty());
		System.out.println(myFirstService.getSecondCustomProperty());
		System.out.println(myFirstService.getPropertyFromApplicationProperties());
	}



}
