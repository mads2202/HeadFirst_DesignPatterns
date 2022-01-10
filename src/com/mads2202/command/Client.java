package com.mads2202.command;

public class Client {
    private Waiter waiter;

    public Client(Waiter waiter) {
        this.waiter = waiter;
    }

    public void makeOrder() {
        waiter.takeOrder();
    }
}