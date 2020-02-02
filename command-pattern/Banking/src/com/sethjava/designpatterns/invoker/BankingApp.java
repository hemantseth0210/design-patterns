package com.sethjava.designpatterns.invoker;

import com.sethjava.designpatterns.commands.Command;

public class BankingApp {
    Command depositCommand;
    Command withdrawCommand;
    Command undoCommand;

    public BankingApp(Command depositCommand, Command withdrawCommand) {
        this.depositCommand = depositCommand;
        this.withdrawCommand = withdrawCommand;
    }

    public void depositButtonPressed(){
        depositCommand.execute();
        undoCommand = depositCommand;
    }

    public void withdrawButtonPressed(){
        withdrawCommand.execute();
        undoCommand = withdrawCommand;
    }

    public void undoButtonPressed(){
        undoCommand.undo();
    }
}
