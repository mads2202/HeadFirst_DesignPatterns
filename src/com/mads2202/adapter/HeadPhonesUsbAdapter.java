package com.mads2202.adapter;

public class HeadPhonesUsbAdapter implements USB {
    private HeadPhones headPhones;

    public HeadPhonesUsbAdapter(HeadPhones headPhones) {
        this.headPhones = headPhones;
    }

    @Override
    public void connect() {
        headPhones.connectHeadPhones();
        headPhones.connectHeadSet();
        System.out.println("USB connected");
    }
}