package com.diliprathore.emailservice.kafka;

import com.diliprathore.basedomains.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service // to make this class as a Spring Bean
public class OrderConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(OrderEvent event) {
        LOGGER.info(String.format("Order Event received in email service-> %s", event.toString()));

        // Save Order event into the database.
    }
}
