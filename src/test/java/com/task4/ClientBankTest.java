package com.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientBankTest {

    @Test
    void addAccount() {
        Account account = new Account("USA",true,100);
        Account account1 = new Account("USA",true,200);
        Account account2 = new Account("USA",true,300);
        Account account3 = new Account("RUB",true,600);
        Account account4 = new Account("EURO",true,700);
        Account account5 = new Account("EURO",false,700);

        ClientBank clientBank = new ClientBank();
        clientBank.setFIO("issy");
        clientBank.addAccount(account);
        clientBank.addAccount(account1);
        clientBank.addAccount(account2);
        clientBank.addAccount(account3);
        clientBank.addAccount(account4);
        clientBank.addAccount(account5);

        System.out.println( "FIO client  " + clientBank.getFIO()  + clientBank.getAccounts());

    }

    @Test
    void findAccount() {
        Account account = new Account("USA",true,100);
        Account account1 = new Account("USA",true,200);
        Account account2 = new Account("USA",true,300);
        Account account3 = new Account("RUB",true,600);
        Account account4 = new Account("EURO",true,700);
        Account account5 = new Account("EURO",false,700);

        ClientBank clientBank = new ClientBank();
        clientBank.setFIO("issy");
        clientBank.addAccount(account);
        clientBank.addAccount(account1);
        clientBank.addAccount(account2);
        clientBank.addAccount(account3);
        clientBank.addAccount(account4);
        clientBank.addAccount(account5);


        Account account0 = new Account("BYN",true,2);
        Account account6 = clientBank.findAccount(account4);
        Account account7 = clientBank.findAccount(account);
        Account account8 = clientBank.findAccount(account0);
        System.out.println(account6+ "\n" + account7);
        System.out.println(account8);

    }
}