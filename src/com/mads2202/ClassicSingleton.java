package com.mads2202;
// мы должны делать INSTANCE volatile для потокобезопастности
// создание экземпляра внутри getInstance() сделано synchronized в тех же целях
public class ClassicSingleton {
    private static volatile ClassicSingleton INSTANCE;

    private ClassicSingleton() {
    }

    public static ClassicSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (ClassicSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ClassicSingleton();
                }
            }
        }
        return INSTANCE;
    }
}