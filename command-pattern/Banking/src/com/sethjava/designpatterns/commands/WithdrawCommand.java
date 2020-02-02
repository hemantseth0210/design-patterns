package com.sethjava.designpatterns.commands;

import com.sethjava.designpatterns.receiver.BankAccount;

public class WithdrawCommand implements Command {

    private BankAccount bankAccount;
    private int amount;

    public WithdrawCommand(BankAccount bankAccount, int amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    @Override
    public void execute() {
        bankAccount.withdraw(amount);
    }

    @Override
    public void undo() {
        bankAccount.deposit(amount);
    }
}