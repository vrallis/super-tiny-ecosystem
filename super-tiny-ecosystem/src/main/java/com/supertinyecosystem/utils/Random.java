package com.supertinyecosystem.utils;

public class Random {
    public int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    public boolean getRandomBoolean() {
        return Math.random() < 0.5;
    }
}
