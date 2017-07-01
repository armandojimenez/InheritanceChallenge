package com.AJ;

/**
 * Created by arman on 7/1/2017.
 */
public class BMW extends Car {


    //Variable declaration for this class
    private String soundSystem;
    private boolean heatingSeats;
    private boolean turbo = false;

    //constructor for this method, some parameters has been filled by default by me
    public BMW(String model, String year, String gasType, int topSpeed, int mileage, String color
            , boolean radio, String soundSystem, boolean heatingSeats, boolean turbo) {
        super("BMW", model, year, gasType, topSpeed, 4, mileage, color, true, false, false);

        this.soundSystem = soundSystem;
        this.heatingSeats = heatingSeats;
        this.turbo = turbo;
    }

    //here I override the super class method and use this one with new parameters
    @Override
    public void ignitionState(boolean ignition) {
        if (ignition) {

            super.ignitionState(ignition);
            soundSystemActivate();
        } else
            super.ignitionState(ignition);

    }

    @Override
    protected void carBasicDetails() {
        super.carBasicDetails();
        System.out.println("This " + getModel() + " includes a " + soundSystem
                + "sound system, heating seats, and turbo");
    }

    //method for the heating seats activation, called on the override ignition method
    protected void heatingSeatsActivate(boolean heatingSeats) {

        if (heatingSeats) {
            System.out.println("Heating seats activated, feel comfy!");
        } else
            System.out.println("Heating seats deactivated.");
    }

    //method for the heating seats activation, called on the override ignition method
    protected void activateTurbo(boolean turbo) {

        if (turbo) {
            System.out.println("Turbo engaged! go faster!");
        } else
            System.out.println("turbo off.");

    }


    protected void soundSystemActivate() {
        System.out.println(soundSystem + " sound system activated, enjoy the booming sound!");
    }

    //getters and setters for this class

    public String getSoundSystem() {
        return soundSystem;
    }

    public void setSoundSystem(String soundSystem) {
        this.soundSystem = soundSystem;
    }

    public boolean getHeatingSeats() {
        return heatingSeats;
    }

    public void setHeatingSeats(boolean heatingSeats) {
        this.heatingSeats = heatingSeats;
    }

    public boolean getTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }
}
