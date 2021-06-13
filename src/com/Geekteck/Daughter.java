package com.Geekteck;

public class Daughter extends  Father implements Printable{
    private String houseAddress;
    private int age;

    public String getHouseAddress() {
        return houseAddress;
    }

    public int getAge() {
        return age;
    }

    public Daughter(int height, int weight, String houseAddress, int age) {
        super(height, weight);
        this.houseAddress = houseAddress;
        this.age = age;


    }

    @Override
    public void print() {
        System.out.println( "вес " + getWeight() + " рост " + getHeight() + " домашний адресс " + getHouseAddress()
                + " возраст " + getAge());
    }
}
