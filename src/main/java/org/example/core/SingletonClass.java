package org.example.core;

/**
 * will do this by another method as well
 */
public class SingletonClass {

    private static volatile SingletonClass INSTANCE;

    private SingletonClass() {
    }

    public static SingletonClass getSingleInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonClass.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonClass();
                }
            }
        }
        return INSTANCE;
    }
}