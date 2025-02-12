package br.com.welio.demo_springboot;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Transaction {
    @Id
    Long id;
    String account;
    double amount;
    String mcc;
    String merchant;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getMcc() {
        return mcc;
    }
    public void setMcc(String mcc) {
        this.mcc = mcc;
    }
    public String getMerchant() {
        return merchant;
    }
    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }
}
