package com.task4;

import java.util.Currency;
import java.util.Objects;

public class Account implements Comparable<Account>{

    private Currency myCurrency; // enum
    private String currency;
    private boolean on_off;
    private double count;


    public Account() {
    }

    public Account(String currency, boolean on_off, double count) {
        this.currency = currency;
        this.on_off = on_off;
        this.count = count;
    }

    public boolean isOn_off() {
        return on_off;
    }

    public void setOn_off(boolean on_off) {
        this.on_off = on_off;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return on_off == account.on_off && count == account.count && Objects.equals(currency, account.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, on_off, count);
    }

    @Override
    public String toString() {
        return "Account{" +
                "currency='" + currency + '\'' +
                ", on_off=" + on_off +
                ", count=" + count +
                '}';
    }

    @Override
    public int compareTo(Account o) {
        return this.currency.compareTo(o.getCurrency());
    }
}
