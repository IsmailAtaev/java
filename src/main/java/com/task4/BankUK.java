package com.task4;

import java.util.ArrayList;
import java.util.Collections;

public class BankUK implements IBank {

    private ArrayList<ClientBank> clientBanks = new ArrayList<>();

    public ArrayList<ClientBank> getClientBanks() {
        return clientBanks;
    }

    public ClientBank getFIOAccount(String FIO){
        for(ClientBank clB: clientBanks){
            if(FIO.equals(clB.getFIO())){
                return clB;
            }
        }
        return null;
    }
    public void setClientBanks(ArrayList<ClientBank> clientBanks) {
        this.clientBanks = clientBanks;
    }

    public BankUK(){
        super();
    }
    public BankUK(ArrayList<ClientBank> clientBanks) {
        this.clientBanks = clientBanks;
    }

    @Override
    public boolean sort() {
        if (!clientBanks.isEmpty()) {
            Collections.sort(clientBanks);
            return true;
        }
        return false;
    }

    @Override
    public void addClient(ClientBank clientBank) {
        this.clientBanks.add(clientBank);
    }

    @Override
    public ClientBank findClientBank(ClientBank clientBank) {
        for (int i = 0; i < clientBanks.size(); i++) {
            if (clientBank.compareTo(clientBanks.get(i)) == 0) {
                return clientBanks.get(i);
            }
        }
        return null;
    }

    public Account findAccount(String FIO, Account account) {
        for (int i = 0; i < clientBanks.size(); i++) {
            if (FIO.compareTo(clientBanks.get(i).getFIO()) == 0) {
                clientBanks.get(i).findAccount(account);
            }
        }
        return null;
    }

    @Override
    public boolean addAccountClient(String FIO, Account account) {
        for (int i = 0; i < clientBanks.size(); i++) {
            if (FIO.compareTo(clientBanks.get(i).getFIO()) == 0) {
                clientBanks.get(i).addAccount(account);
                return true;
            }
        }
        return false;
    }

    @Override
    public double getCountMoney(String FIO, String currency) {

        double totalMoney = 0;
        for (int i = 0; i < clientBanks.size(); i++) {
            if (FIO.equals(clientBanks.get(i).getFIO())) {
                for (int j = 0; j < clientBanks.get(i).accounts.size(); j++) {
                    if (currency.equals(clientBanks.get(i).accounts.get(j))) {
                        totalMoney += clientBanks.get(i).accounts.get(j).getCount();
                    }
                }
                break;
            }
        }
        return totalMoney;
    }
}
