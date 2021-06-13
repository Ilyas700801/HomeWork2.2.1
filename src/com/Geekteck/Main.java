package com.Geekteck;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите имя класса:");
        createObject(scanner.nextLine());
    }

    public static Father createObject(String className) {
        switch (className) {
            case "Son":
                Son son = new Son(175, 70, "добрый", "смуглый");
                son.print();
                return son;

            case "Daughter":
                Daughter daughter = new Daughter(160,50,"Байтик Батыра д.152",25);
                daughter.print();
                return daughter;

            case "Grandson":
                Grandson grandson = new Grandson(120,40,30,40);
                grandson.print();
                return grandson;
        }
        return null;
    }
}
