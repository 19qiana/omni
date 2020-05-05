package com.aqian.Omni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.aqian.Omni.Controller", "com.aqian.Omni.Manager", "com.aqian.Omni.Model"})
public class OmniApplication {
	public static void main(String[] args) {
		SpringApplication.run(OmniApplication.class, args);
	}
}
