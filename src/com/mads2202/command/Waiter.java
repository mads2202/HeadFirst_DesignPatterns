package com.mads2202.command;

public class Waiter implements Command {
    private Cooker cookerBob;

    public Waiter(Cooker cookerBob) {
        this.cookerBob = cookerBob;
    }

    public void takeOrder() {
        execute();
        System.out.println("Bon appetit");
    }

    @Override
    public void execute() {
        cookerBob.prepareOrder();
    }
}