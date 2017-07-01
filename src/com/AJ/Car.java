package com.AJ;


/**
 * Created by arman on 7/1/2017.
 */
public class Car {


    //Member variables declaration
    private final String brand;
    private final String model;
    private final String year;
    private String gasType;
    private int topSpeed;
    private final int wheels;
    private int mileage;
    private String color;
    private final boolean luxuryCar;
    private boolean ignition;
    private boolean radio;


    //Main constructor
    public Car(String brand, String model, String year, String gasType, int topSpeed, int wheels,
               int mileage, String color, boolean luxuryCar, boolean ignition, boolean radio) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.gasType = gasType;
        this.topSpeed = topSpeed;
        this.wheels = wheels;
        this.mileage = mileage;
        this.color = color;
        this.luxuryCar = luxuryCar;
        this.ignition = ignition;
        this.radio = radio;


    }

    //method to print all the car details from the member variables
    protected void carBasicDetails() {

        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Motor runs on " + this.gasType + ".");
        System.out.println("This car top speed is: " + this.topSpeed);
        System.out.println("Mileage: " + this.mileage + ", color: " + this.color + ".");


    }


    //method that tells the speed of your car and a message
    private void move(int speed) {
        System.out.println("Moving at " + speed + " Mmh");
    }

    //method to tell the direction you're steering and validates that the input is right or left
    protected void steering(String direction) {

        //validation to make sure the input is "right" or "left"
        String validInput = direction.toLowerCase();
        if (ignition) {

            if (validInput == "right" || validInput == "left") {

                signals(validInput);
                System.out.println("Your car steered to the " + validInput + "!");

            } else
                System.out.println("You did not enter a valid steering direction!");
        } else
            System.out.println("You can't steer with the motor off!");


    }

    //method that tells you the gear you're on, limited to 8 gears.
    protected void gears(int gear) {


        if (ignition) {

            if (gear < 7 && gear > 0) {

                switch (gear) {

                    case 1:
                        System.out.println("Your car is on the " + gear + " gear, going slow...");
                        move(10);
                        break;
                    case 2:
                        System.out.println("Your car is on the " + gear + " gear, taking speed");
                        move(20);
                        break;
                    case 3:
                        System.out.println("your car is on the " + gear + " gear!");
                        move(35);
                        break;
                    case 4:
                        System.out.println("your car is on the " + gear + " gear!");
                        move(50);
                        break;
                    case 5:
                        System.out.println("your car is on the " + gear + " gear, going really fast!");
                        move(80);
                        break;
                    case 6:
                        System.out.println("your car is on the " + gear + " gear! lighting fast!");
                        move(135);
                        break;
                }

            } else
                System.out.println("You did not enter a valid gear number!");


        } else
            System.out.println("Your engine is not running, so gear is on P");
    }


    public void ignitionState(boolean ignition) {

        if (ignition) {
            seatbeltWarning();
            System.out.println("Engine is on and ready to rumble!!");
            radioOnAndOff();

        } else
            System.out.println("Engine is off, so is not going to move...");

        setIgnition(ignition);


    }

    private void seatbeltWarning() {
        System.out.println("Please fasten your seatbelt, security is first!");
    }

    private void radioOnAndOff() {

        System.out.println("Radio is on, enjoy your favorite music!");
        setRadio(true);


    }

    public void stop() {
        System.out.println("The car stopped");
    }

    //method with a message for the signal and runs on the
    private void signals(String direction) {

        System.out.println(direction + " directional signals activated.");

    }


    //getters for member variables
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getGasType() {
        return gasType;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getWheels() {
        return wheels;
    }

    public int getMileage() {
        return mileage;
    }

    public String getColor() {
        return color;
    }

    public boolean getLuxuryCar() {
        return luxuryCar;
    }

    public boolean getIgnition() {
        return ignition;
    }

    public boolean getRadio() {
        return radio;
    }

    //setters for member variables, solo cree estos dos, porque las demas variables no deben cambiar despues de-
    //inicializar por primera vez, por ejemplo, el modelo y el year no cambian.

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIgnition(boolean ignition) {
        this.ignition = ignition;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }
}
