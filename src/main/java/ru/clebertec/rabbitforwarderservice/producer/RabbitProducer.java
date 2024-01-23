package ru.clebertec.rabbitforwarderservice.producer;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageDeliveryMode;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class RabbitProducer {
    //тут тупо первоначально заполнение, дергается метод из контроллера
    private final RabbitTemplate rabbitTemplate;
    private final ObjectMapper objectMapper;
    @Value("${clevertec.rabbit.config.exchange-name-with-all-data}")
    private String exchange;

    public void produceMessage(String routeMessage) {
        MessageProperties messageProperties = new MessageProperties();
        messageProperties.setDeliveryMode(MessageDeliveryMode.PERSISTENT);

        Optional.of(routeMessage)
                .map(String::getBytes)
                .map(bytes -> new Message(bytes, messageProperties))
                .ifPresent(msg -> rabbitTemplate.send(exchange, "routingKey", msg));
    }
}
