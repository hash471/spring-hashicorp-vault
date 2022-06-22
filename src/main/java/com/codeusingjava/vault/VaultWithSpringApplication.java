package com.codeusingjava.vault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.codeusingjava.vault.configuration.VaultConfig;

@SpringBootApplication
public class VaultWithSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(VaultWithSpringApplication.class, args);
		VaultConfig vaultconfig = context.getBean(VaultConfig.class);
		System.out.println("Username: " + vaultconfig.getUsername());
		System.out.println("Password: " + vaultconfig.getPassword());
	}

}
