package com.Geekteck;

import java.awt.*;
import java.awt.print.PageFormat;

import java.awt.print.PrinterException;

public class Son extends Father implements Printable {
    private String character;
    private String colorOfTheSkin;

    public String getCharacter() {
        return character;
    }

    public String getColorOfTheSkin() {
        return colorOfTheSkin;
    }

    public Son(int height, int weight, String character, String colorOfTheSkin) {
        super(height, weight);
        this.character = character;
        this.colorOfTheSkin = colorOfTheSkin;


    }

    @Override
    public void print() {
        System.out.println("вес " + getWeight() + " рост " + getHeight() + " характер "
                + getCharacter() + " цвет кожи " + getColorOfTheSkin());

    }
}
