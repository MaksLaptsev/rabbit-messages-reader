package ru.clevertec.banking.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "clevertec.rabbit.consumer.queues.names")
public class ConsumerProperties {
    private String[] accountInfo;
    private String[] cardInfo;
    private String[] creditDetails;
    private String[] currencyRate;
    private String[] customer;
    private String[] depositInfo;
}
