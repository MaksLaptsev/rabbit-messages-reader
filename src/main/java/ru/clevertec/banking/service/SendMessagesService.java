package ru.clevertec.banking.service;

public interface SendMessagesService {

    public void sendAccount_info(String message);
    public void sendCard_info(String message);
    public void sendCredit_details(String message);
    public void sendCurrency_rate(String message);
    public void sendCustomer(String message);
    public void sendDeposit_info(String message);
}
