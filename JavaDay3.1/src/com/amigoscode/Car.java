package com.amigoscode;
import java.time.Year;

public class Car {
    private String vehicleBrand;
    private String vehicleModel;
    private Color color;
    private Year manufactureYear;
    private String seaters;


    public Car(String vehicleBrand, String vehicleModel, Color color, Year manufactureYear, String seaters) {
        this.vehicleBrand = vehicleBrand;
        this.vehicleModel = vehicleModel;
        this.color = color;
        this.manufactureYear = manufactureYear;
        this.seaters = seaters;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vehicleBrand='" + vehicleBrand + '\'' +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", color=" + color +
                ", manufactureYear=" + manufactureYear +
                ", seaters=" + seaters +
                '}';
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Year getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(Year manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getSeaters() {
        return seaters;
    }

    public void setSeaters(String seaters) {
        this.seaters = seaters;
    }
}
