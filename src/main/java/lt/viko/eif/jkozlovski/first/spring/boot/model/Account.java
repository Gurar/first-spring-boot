package lt.viko.eif.jkozlovski.first.spring.boot.model;

import jakarta.persistence.*;

import java.math.BigInteger;
@Entity
@Table(name = "account")
public class Account extends BaseEntity {

private BigInteger accountNumber;

private double balance;

    public BigInteger getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account() {
    }

    public Account(BigInteger accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountNumber(BigInteger accountNumber) {
        this.accountNumber = accountNumber;
    }
}
