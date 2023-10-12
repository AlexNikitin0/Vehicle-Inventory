package com.pluralsight;

public class Vehicle {
    //class fields

    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;

    //no arg const

    public Vehicle(){
        vehicleId = 0;
        makeModel = "";
        color = "";
        odometerReading = 0;
        price = 0;
    }

    // full consty

    public Vehicle(int id, String mod, String col, int odo, float pr){

        this.vehicleId = id;
        this.makeModel = mod;
        this.color = col;
        this.odometerReading = odo;
        this.price = pr;

    }

    //getters

    public long getVehicleID(){
        return vehicleId;
    }
    public String getMakeModel(){
        return makeModel;
    }
    public String getColor(){
        return color;
    }
    public int getOdometerReading(){
        return odometerReading;
    }
    public float getPrice(){
        return price;
    }
    //setters
    public void setVehicleId(long vID){
        vehicleId = vID;
    }
    public void setMakeModel(String mkmodel){
        makeModel = mkmodel;
    }
    public void setColor(String col){
        color = col;
    }
    public void setOdometerReading(int odo){
        odometerReading = odo;
    }
    public void setPrice(float pr){
        price = pr;
    }


}
