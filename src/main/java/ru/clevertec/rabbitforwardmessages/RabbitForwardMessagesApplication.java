package ru.clevertec.rabbitforwardmessages;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class RabbitForwardMessagesApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitForwardMessagesApplication.class, args);
    }

}
