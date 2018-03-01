package main.app;

import main.cars.AbstractCar;
import main.cars.FreightCar;
import main.cars.PassengerCar;
import main.cars.Supercar;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("---Freight car check---");
        FreightCar frCar = new FreightCar("SANYA", "Kamaz", 12000); //polymorphism
        System.out.println(frCar.getCarrying());
        System.out.println(frCar.getMaster());
        System.out.println(frCar.getSound());
        System.out.println(frCar.getModel());
        System.out.println(frCar.getType());
        System.out.println(frCar);
        frCar.setQuantityWheel(50);
        System.out.println("New quantity of wheels is " + frCar.getQuantityWheel());
        frCar.setCarrying(900000);
        System.out.println("New carrying is " + frCar.getCarrying());
        System.out.println("---Passenger car check---");
        PassengerCar pasCar = new PassengerCar("Vitalik", "Lada", 240); //polymorphism
        System.out.println(pasCar.getMaster());
        System.out.println(pasCar.getSound());
        System.out.println(pasCar.getModel());
        System.out.println(pasCar.getType());
        System.out.println(pasCar.getMaxSpeed());
        pasCar.setMaxSpeed(300);
        System.out.println("New speed is " + pasCar.getMaxSpeed());
        System.out.println("---Super car check---");
        Supercar sCar = new Supercar("Rostislav", "Bugatti", 1500); //polymorphism
        System.out.println("Faster than speed of sound? " + sCar.fasterThanSpeedOfSound());
        System.out.println("She has a spoiler? " + sCar.hasSpoiler());
        System.out.println(sCar.getMaster()); //inheritance

        List<AbstractCar> cars = new ArrayList<>();
        cars.add(0, frCar);
        cars.add(1, pasCar);
        cars.add(2, sCar);

        for (AbstractCar car : cars) {
            System.out.println(car.getMaster());
        }
        PassengerCar ssCar = (PassengerCar) sCar;
        System.out.println(ssCar.getMaxSpeed());


    }
}
