package ru.clevertec.banking.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "clevertec.feign.service.name")
public class FeignNamesProperties {
    private String accountClient;
    private String cardClient;
    private String creditClient;
    private String customerClient;
    private String depositClient;
}
