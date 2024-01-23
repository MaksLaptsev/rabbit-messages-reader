package ru.clebertec.rabbitforwarderservice.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.clebertec.rabbitforwarderservice.producer.RabbitProducer;

@Slf4j
@RestController
@RequestMapping("/api/messages")
@RequiredArgsConstructor
public class RabbitController {
    private final RabbitProducer rabbitProducer;

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/publish")
    public void publishMessage(@RequestBody String routeMessage) {
        rabbitProducer.produceMessage(routeMessage);
    }
}
