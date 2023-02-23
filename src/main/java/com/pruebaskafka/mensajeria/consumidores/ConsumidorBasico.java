package com.pruebaskafka.mensajeria.consumidores;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumidorBasico {

    public static final String TOPIC = "testtopic1";

    private final Logger logger = LoggerFactory.getLogger(ConsumidorBasico.class);

    @KafkaListener(topics = TOPIC, groupId = "${spring.kafka.group-id}")
    public void listenGroupFoo(String message) {
        logger.info("Received Message " + message);
    }
}
