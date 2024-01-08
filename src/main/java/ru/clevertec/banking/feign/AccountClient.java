package ru.clevertec.banking.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "${clevertec.feign.service.name.account-client}")
public interface AccountClient {
    @RequestMapping(method = RequestMethod.POST, value = "${clevertec.feign.service.path.account-client-path}",
            consumes = "application/json")
    void send(@RequestBody String message);
}
