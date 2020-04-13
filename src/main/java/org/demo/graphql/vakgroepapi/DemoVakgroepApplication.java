package org.demo.graphql.vakgroepapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import graphql.servlet.SimpleGraphQLHttpServlet;

@SpringBootApplication
public class DemoVakgroepApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoVakgroepApplication.class, args);
	}

}
