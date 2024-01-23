package ru.clebertec.rabbitforwarderservice.conf;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.rabbit.config")
@Data
public class Property {
    String nameForwardExchange;
    String nameQueueWithCustomers;
    String exchangeNameWithAllData;
}
