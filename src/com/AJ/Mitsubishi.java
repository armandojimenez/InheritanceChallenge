package com.AJ;

/**
 * Created by arman on 7/1/2017.
 */
public class Mitsubishi extends Car {

    //Member variable declaration
    private String sunroof;
    private boolean wifi;
    private boolean camera;

    //constructor for the class
    //algunos campos los inicialize por default, porque son especificos para Mitsubishi, como el brand y el numero de gomas.
    public Mitsubishi(String model, String year, String gasType, int topSpeed,
                      int mileage, String color, boolean radio, String sunroof, boolean wifi, boolean camera, boolean ignition) {
        super("Mitsubishi", model, year, gasType, topSpeed, 4, mileage, color, false, ignition, radio);

        this.sunroof = sunroof;
        this.wifi = wifi;
        this.camera = camera;
    }


    //method that states if the sunroof is open or closed and a message depending on the state
    protected void sunroofState(String state) {

        String validInput = state.toLowerCase();


        if (validInput == "open") {
            System.out.println("The sunroof is " + validInput + ", enjoy the view!");
        } else if (validInput == "closed") {
            System.out.println(" The sunroof is " + validInput + ", you should open it!");
        }
        else
            System.out.println("you did not enter a valid state");


    }


    @Override //here an override so this method gets called instead of the one in the super class,
    // it first check turn the ignition state, if the engine is on, Wi-fi will turn on automatically.
    public void ignitionState(boolean ignition) {
        super.ignitionState(ignition);
        wifiAndCamera(ignition);
    }

    private void wifiAndCamera(boolean ignition) {


        if (ignition) {
            setWifi(true);
            setCamera(true);
            System.out.println("Wi-Fi activated, all your devices connected");
            System.out.println("Your rear and front camera is ready for use.");
        } else if (ignition == false) {
            setWifi(false);
            setCamera(false);
        }
    }

    @Override //Override car details method for this one with more info included
    protected void carBasicDetails() {
        super.carBasicDetails();
        System.out.println("This " + getModel() + " includes wi-fi, camera, and sunroof.");
    }

    //getters for Mitsubishi class variable


    String getSunroof() {
        return sunroof;
    }

    public boolean getWifi() {
        return wifi;
    }

    public boolean getCamera() {
        return camera;
    }

    //setters for Mitsubishi class variable


    public void setSunroof(String sunroof) {
        this.sunroof = sunroof;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public void setCamera(boolean camera) {
        this.camera = camera;
    }
}
