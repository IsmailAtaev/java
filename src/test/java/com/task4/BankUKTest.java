package com.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankUKTest {

    @Test
    void addClient() {
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


        Account account11 = new Account("USA",true,100);
        Account account22 = new Account("USA",true,200);
        Account account33 = new Account("USA",true,300);
        Account account44 = new Account("RUB",true,600);
        Account account55 = new Account("EURO",true,700);
        Account account66 = new Account("EURO",false,700);

        ClientBank clientBank1 = new ClientBank();
        clientBank.setFIO("ataew");
        clientBank.addAccount(account11);
        clientBank.addAccount(account22);
        clientBank.addAccount(account33);
        clientBank.addAccount(account44);
        clientBank.addAccount(account55);
        clientBank.addAccount(account66);

        BankUK bankUK = new BankUK();
        bankUK.addClient(clientBank);
        bankUK.addClient(clientBank1);


        System.out.println(bankUK.getFIOAccount("ataew").getAccounts());






    }

    @Test
    void findClientBank() {
    }

    @Test
    void findAccount() {
    }

    @Test
    void addAccountClientTest() {




    }

    @Test
    void getCountMoney() {
    }
}