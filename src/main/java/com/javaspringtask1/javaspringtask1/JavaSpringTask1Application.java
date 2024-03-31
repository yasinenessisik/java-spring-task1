package com.javaspringtask1.javaspringtask1;

import com.javaspringtask1.javaspringtask1.service.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaSpringTask1Application {
	private final CustomerService customerService;

    public JavaSpringTask1Application(CustomerService customerService) {
        this.customerService = customerService;
    }

    public static void main(String[] args) {
		SpringApplication.run(JavaSpringTask1Application.class, args);
	}

}
