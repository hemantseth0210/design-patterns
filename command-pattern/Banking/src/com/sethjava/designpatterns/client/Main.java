package com.sethjava.designpatterns.client;

import com.sethjava.designpatterns.commands.DepositCommand;
import com.sethjava.designpatterns.commands.WithdrawCommand;
import com.sethjava.designpatterns.invoker.BankingApp;
import com.sethjava.designpatterns.receiver.BankAccount;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        DepositCommand depositCommand = new DepositCommand(bankAccount, 100);
        WithdrawCommand withdrawCommand = new WithdrawCommand(bankAccount, 50);
        BankingApp bankingApp = new BankingApp(depositCommand, withdrawCommand);
        bankingApp.depositButtonPressed();
        bankingApp.withdrawButtonPressed();
        bankingApp.undoButtonPressed();
    }
}
