package com.amigoscode;

public class Garage {
    private String tools;
    private CarParts carParts;
    private String tyreStation;
    private String wrappingStation;
    private String air_conStation;
    private String electrical;
    private String waxingStation;
    private String carWash;

    public Garage(String tools, CarParts carParts) {
        this.tools = tools;
        this.carParts = carParts;
        this.tyreStation = tyreStation;
        this.wrappingStation = wrappingStation;
        this.air_conStation = air_conStation;
        this.electrical = electrical;
        this.waxingStation = waxingStation;
        this.carWash = carWash;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "tools='" + tools + '\'' +
                ", carParts=" + carParts +
                ", tyreStation='" + tyreStation + '\'' +
                ", wrappingStation='" + wrappingStation + '\'' +
                ", air_conStation='" + air_conStation + '\'' +
                ", electrical='" + electrical + '\'' +
                ", waxingStation='" + waxingStation + '\'' +
                ", carWash='" + carWash + '\'' +
                '}';
    }

    public String getTools() {
        return tools;
    }

    public void setTools(String tools) {
        this.tools = tools;
    }

    public CarParts getCarParts() {
        return carParts;
    }

    public void setCarParts(CarParts carParts) {
        this.carParts = carParts;
    }

    public String getTyreStation() {
        return tyreStation;
    }

    public void setTyreStation(String tyreStation) {
        this.tyreStation = tyreStation;
    }

    public String getWrappingStation() {
        return wrappingStation;
    }

    public void setWrappingStation(String wrappingStation) {
        this.wrappingStation = wrappingStation;
    }

    public String getAir_conStation() {
        return air_conStation;
    }

    public void setAir_conStation(String air_conStation) {
        this.air_conStation = air_conStation;
    }

    public String getElectrical() {
        return electrical;
    }

    public void setElectrical(String electrical) {
        this.electrical = electrical;
    }

    public String getWaxingStation() {
        return waxingStation;
    }

    public void setWaxingStation(String waxingStation) {
        this.waxingStation = waxingStation;
    }

    public String getCarWash() {
        return carWash;
    }

    public void setCarWash(String carWash) {
        this.carWash = carWash;
    }
}
