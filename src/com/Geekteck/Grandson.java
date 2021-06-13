package com.Geekteck;

public class Grandson extends Father implements Printable{
    public int armLenght;
    public int legLenght;

    public int getArmLenght() {
        return armLenght;
    }

    public int getLegLenght() {
        return legLenght;
    }

    public Grandson(int height, int weight, int armLenght, int legLenght) {
        super(height, weight);
        this.armLenght = armLenght;
        this.legLenght = legLenght;


    }

    @Override
    public void print() {
        System.out.println("вес " + getWeight() + " рост " + getHeight() + " длина руки "
                + getArmLenght() + " длина ноги " + getLegLenght());
    }
}
