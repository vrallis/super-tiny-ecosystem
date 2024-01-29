package com.supertinyecosystem.entities;

public class Wolve {
    private int xPosition;
    private int yPosition;
    private int daysWithoutFood;
    private boolean isAlive;
    private boolean canReproduce;

    // constructor
    public Wolve(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.daysWithoutFood = 0;
        this.isAlive = true;
        this.canReproduce = false;
    }

    public void move() {
        int random = (int) (Math.random() * 4);
        switch (random) {
            case 0:
                this.xPosition++;
                break;
            case 1:
                this.xPosition--;
                break;
            case 2:
                this.yPosition++;
                break;
            case 3:
                this.yPosition--;
                break;
        }
    }

    // Method to eat
    public void eat() {
        this.daysWithoutFood = 0;
    }

    // Method to update the fox
    public void update() {

        daysWithoutFood++;
        if (daysWithoutFood > 10) {
            this.isAlive = false;
        }

    }
    
    public boolean canReproduce() {
        return canReproduce;
    }


    // Getters and Setters
    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public boolean isAlive() {
        return isAlive;
    }
}
