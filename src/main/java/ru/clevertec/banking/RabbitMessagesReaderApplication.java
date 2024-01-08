package ru.clevertec.banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import ru.clevertec.banking.properties.ConsumerProperties;
import ru.clevertec.banking.properties.FeignNamesProperties;
import ru.clevertec.banking.properties.FeignPathMapping;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableScheduling
@EnableConfigurationProperties({ConsumerProperties.class, FeignPathMapping.class, FeignNamesProperties.class})
public class RabbitMessagesReaderApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitMessagesReaderApplication.class, args);
    }

}
