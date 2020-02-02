package com.sethjava.designpatterns.commands;

import com.sethjava.designpatterns.receiver.BankAccount;

public class DepositCommand implements Command {

    private BankAccount bankAccount;
    private int amount;

    public DepositCommand(BankAccount bankAccount, int amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    @Override
    public void execute() {
        bankAccount.deposit(amount);
    }

    @Override
    public void undo() {
        bankAccount.withdraw(amount);
    }
}
