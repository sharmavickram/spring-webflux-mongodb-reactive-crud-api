package com.example.springwebfluxmongodbreactivecrudapi;



import com.example.springwebfluxmongodbreactivecrudapi.model.Invoice;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class SaveOrUpdateInvoiceRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		WebClient client = WebClient.create("http://localhost:9090");
		Mono<Invoice> mono= client
				.post()
				.uri("/invoice/save")
				.body(Mono.just(new Invoice(1, "Invoice1", "INV001", 2345.75)),Invoice.class)
				.retrieve().bodyToMono(Invoice.class);
		mono.subscribe(System.out::println);
	}

}