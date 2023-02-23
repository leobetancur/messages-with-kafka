package com.pruebaskafka.mensajeria;

import com.pruebaskafka.mensajeria.consumidores.ConsumidorBasico;
import com.pruebaskafka.mensajeria.productores.ProductorBasico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class MensajeriaApplication implements CommandLineRunner {

	@Autowired
	private ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(MensajeriaApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		//ConsumidorBasico consumidorBasico = context.getBean(ConsumidorBasico.class);

		ProductorBasico productorBasico = context.getBean(ProductorBasico.class);
		productorBasico.sendMessage("Hola desde Spring Boot");
		productorBasico.sendMessageWithCallBack("Hola desde Spring Boot with callBack");



	}

}
