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

	/*
	* QUI DEFINIAMO LE ROUTE PER TROVARE I MICROSERVIZI
	* Per comodità conviene mettere un prefisso nel controller per ogni gruppo di chiamate, es per Position pos/
	* 	@RestController
		@RequestMapping("/pos")
		public class PositionController
	* in modo da aggiungere solo 1 regola, altrimenti bisognerebbe aggiungere una regola per ogni chiamata
	* */
	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				// così gli diciamo che questa route va a prendere il servizio position-service
				// all url http://localhost:8081 e fa il match con tutti gli endpoint che iniziano per /pos/

				//ROUTE POSITION
				.route("position", r -> r.path("/pos/*").uri("http://localhost:8081/"))
				.route("tutte-le-altre-api", r -> r.path("/*").uri("http://localhost:8080/"))

				// TODO : fare la stessa cosa per le altri gruppi di chiamate e l'api gateway è fatto


				.build();
	}



}
