package com.devsuperior.aula;
import com.devsuperior.aula.entities.Order;
import com.devsuperior.aula.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order1 = new Order(1034, 150.00, 20.00);
		Order order2 = new Order(2282, 800.00, 10.00);
		Order order3 = new Order(1039, 95.90, 0.0);

		printorder(order1);
		printorder(order2);
		printorder(order3);
	}
		private void printorder(Order order){
		double total = orderService.total(order);
		System.out.printf("Pedido código %d%nValor total: R$ %.2f%n%n", order.getCode(), total);
		}
}


