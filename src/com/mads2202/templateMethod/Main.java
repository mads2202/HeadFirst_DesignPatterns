package com.mads2202.templateMethod;

public class Main {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        coffee.prepare();
        Beverage tea = new Tea();
        tea.prepare();
    }
}