package ru.clevertec.banking.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("${clevertec.feign.service.name.customer-client}")
public interface CustomerClient {
    @RequestMapping(method = RequestMethod.POST, value = "${clevertec.feign.service.path.customer-client-path}",
            consumes = "application/json")
    void send(@RequestBody String message);
}
