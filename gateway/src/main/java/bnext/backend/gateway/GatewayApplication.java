package bnext.backend.gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
// L'annotazione EnableEurekaCliente è deprecata e non serve metterla in questo progetto
// perchè usa springboot 3
@EnableDiscoveryClient
public class GatewayApplication {



	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);

	}

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("get-all-positions", r -> r.path("/pos/*").uri("http://localhost:8081/"))


				.build();
	}



}
