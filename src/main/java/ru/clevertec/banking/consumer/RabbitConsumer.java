package ru.clevertec.banking.consumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import ru.clevertec.banking.service.SendMessagesService;

@Slf4j
@Service
@RequiredArgsConstructor
public class RabbitConsumer {

    private final SendMessagesService messagesService;


    @RabbitListener(queues = "${clevertec.rabbit.consumer.queues.names.account-info}")
    public void consumeHeaderAccountInfo(String message) {
        messagesService.sendAccount_info(message);
    }

    @RabbitListener(queues = "${clevertec.rabbit.consumer.queues.names.card-info}")
    public void consumeHeaderCardInfo(String message) {
        messagesService.sendCard_info(message);
    }

    @RabbitListener(queues = "${clevertec.rabbit.consumer.queues.names.credit-details}")
    public void consumeHeaderCreditDetails(String message) {
        messagesService.sendCredit_details(message);
    }

    @RabbitListener(queues = "${clevertec.rabbit.consumer.queues.names.currency-rate}")
    public void consumeHeaderCurrencyRate(String message) {
        messagesService.sendCurrency_rate(message);
    }

    @RabbitListener(queues = "${clevertec.rabbit.consumer.queues.names.customer}")
    public void consumeHeaderCustomer(String message) {
        messagesService.sendCustomer(message);
    }

    @RabbitListener(queues = "${clevertec.rabbit.consumer.queues.names.deposit-info}")
    public void consumeHeaderOneQueueMessage(String message) {
        messagesService.sendDeposit_info(message);
    }

}
