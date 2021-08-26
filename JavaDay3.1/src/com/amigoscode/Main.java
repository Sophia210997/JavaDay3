package com.amigoscode;
import java.time.Year;

public class Main {

    public static void main(String[] args) {
        Car astonMartin = new Car(
                "Aston Martin",
                "Rapid",
                Color.RED,
                Year.of(2010),
                "2"
        );
        System.out.println(astonMartin.getManufactureYear());
        Garage ourGarage = new Garage(
                "hammer",
                CarParts.BOOT
        );
        System.out.println(ourGarage.getCarParts());
    }
    }












//Model a car garage using classes. Use your imagination and think about the properties and behaviours.
// Note that you might want to create 2 class. One for Garage and another for Car. The garage holds a list of cars....
