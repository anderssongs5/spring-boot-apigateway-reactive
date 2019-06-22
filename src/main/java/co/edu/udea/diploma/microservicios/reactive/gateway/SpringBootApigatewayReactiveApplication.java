package co.edu.udea.diploma.microservicios.reactive.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootApigatewayReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApigatewayReactiveApplication.class, args);
	}

}
