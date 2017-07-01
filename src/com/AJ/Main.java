package com.AJ;

public class Main {

    public static void main(String[] args) {

        //Here I created an object from class Mitsubishi, extended to class Car
        Mitsubishi bcar = new Mitsubishi("Mirage", "2016", "Gasoline", 80,
                15000, "red", false, "open", false, false, false);

        //here I created an object from the BMW class, extended to the Car class
        BMW kcar = new BMW("M6", "2017", "Gasoline", 235, 355, "black",
                false, "rockford", false, false);


        //behaviors for object bcar from class Mitsubishi!
        //Here I test and simulate various behaviour, if the ignitionState is false, then the other methods
        //will print a message that the ignition needs to be on, so everything depends on the ignition


        System.out.println("************ Mitsubishi details *************");
        bcar.carBasicDetails();

        System.out.println("************ Mitsubishi Behaviors *************");
        bcar.ignitionState(true);
        bcar.gears(1);
        bcar.gears(2);
        bcar.stop();
        bcar.steering("left");
        bcar.gears(2);
        bcar.sunroofState("Open");
        bcar.gears(3);
        bcar.steering("right");
        bcar.gears(5);
        bcar.gears(6);
        bcar.sunroofState("closed");
        bcar.stop();
        bcar.ignitionState(false);

        //behaviour and detail for BMW object
        System.out.println("************ BMW details *************");
        kcar.carBasicDetails();

        System.out.println("************ BMW Behaviors  *************");
        kcar.ignitionState(true);
        kcar.gears(2);
        kcar.steering("right");
        kcar.steering("left");
        kcar.gears(3);
        kcar.gears(4);
        kcar.gears(5);
        kcar.heatingSeatsActivate(true);
        kcar.activateTurbo(true);
        kcar.gears(6);
        kcar.stop();
        kcar.heatingSeatsActivate(false);
        kcar.activateTurbo(false);
        kcar.ignitionState(false);


    }
}
