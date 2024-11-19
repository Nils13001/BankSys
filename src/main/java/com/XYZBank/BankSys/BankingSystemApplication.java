package com.XYZBank.BankSys;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "XYZ Bank",
				description = "Trial of Banking Application on backend",
				version = "v1.0",
				contact = @Contact(
						name = "Nilesh Agarwalla",
						email = "nilsstudy29@gmail.com",
						url = "https://github.com/Nils13001/BankSys"
				),
				license = @License(
						name = "XYZ Bank",
						url = "https://github.com/Nils13001/BankSys"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "XYZ Bank Documentation",
				url = "https://github.com/Nils13001/BankSys"
		)
)
public class BankingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingSystemApplication.class, args);
	}

}
