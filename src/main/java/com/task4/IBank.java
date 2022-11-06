package com.task4;

public interface IBank {

    boolean sort();

    void addClient(ClientBank clientBank);

    ClientBank findClientBank(ClientBank clientBank);

    boolean addAccountClient(String FIO,Account account); // komu db i cto db

    double getCountMoney(String FIO,String currency);

}