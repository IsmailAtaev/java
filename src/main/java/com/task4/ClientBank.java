package com.task4;

import java.util.ArrayList;

public class ClientBank implements Comparable<ClientBank>{

    private String FIO;
    protected ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).compareTo(account) == 0) {
                accounts.get(i).setCount(accounts.get(i).getCount() + account.getCount());
                accounts.get(i).setOn_off(account.isOn_off());
                return;
            }
        }
        this.accounts.add(account);
    }

    public Account findAccount(Account account) {
        for (Account account1 : accounts) {
            if (account.getCurrency().equals(account1.getCurrency())) {
                return account;
            }
        }
        return null;
    }

    public ClientBank() {
    }

    public ClientBank(String FIO, ArrayList<Account> accounts) {
        this.FIO = FIO;
        this.accounts = accounts;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }


    @Override
    public int compareTo(ClientBank o) {
        return this.FIO.compareTo(o.getFIO());
    }
}
