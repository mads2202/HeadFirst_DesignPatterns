package com.mads2202.adapter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<USB> usbDevices = new ArrayList<>();
        HeadPhones noUsbHeadPhones = new HeadPhones();
        HeadPhonesUsbAdapter usbAdapter = new HeadPhonesUsbAdapter(noUsbHeadPhones);
        usbDevices.add(usbAdapter);
        usbDevices.get(0).connect();
    }
}