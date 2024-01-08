package ru.clevertec.banking.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.clevertec.banking.feign.*;
import ru.clevertec.banking.service.SendMessagesService;

@Slf4j
@Service
@RequiredArgsConstructor
public class SendMessagesServiceImpl implements SendMessagesService {
    private final AccountClient accountApi;
    private final CardClient cardApi;
    private final CreditClient creditApi;
    private final CustomerClient customerApi;
    private final DepositClient depositApi;

    @Override
    public void sendAccount_info(String message) {
        accountApi.send(message);
    }

    @Override
    public void sendCard_info(String message) {
        //cardApi.send(message);
    }

    @Override
    public void sendCredit_details(String message) {
        //creditApi.send(message);
    }

    @Override
    public void sendCurrency_rate(String message) {

    }

    @Override
    public void sendCustomer(String message) {
        //customerApi.send(message);
    }

    @Override
    public void sendDeposit_info(String message) {
        //depositApi.send(message);
    }
}
