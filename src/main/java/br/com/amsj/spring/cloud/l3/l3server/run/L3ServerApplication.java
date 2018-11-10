package br.com.amsj.spring.cloud.l3.l3server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class L3ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(L3ServerApplication.class, args);
	}
}
