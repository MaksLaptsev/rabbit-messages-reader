package ru.clevertec.banking.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "clevertec.feign.service.path")
public class FeignPathMapping {
    private String accountClientPath;
    private String cardClientPath;
    private String creditClientPath;
    private String customerClientPath;
    private String depositClientPath;
}
