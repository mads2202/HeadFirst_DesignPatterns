package com.mads2202.command;

public class Main {
    public static void main(String[] args) {
        Client client= new Client(new Waiter(new Cooker()));
        client.makeOrder();
    }
}