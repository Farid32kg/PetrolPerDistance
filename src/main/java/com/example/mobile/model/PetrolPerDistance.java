package com.example.mobile.model;

public class PetrolPerDistance {

    private  double distance;
    private double petrolLitrePer100km;
    private double petrolPrice;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getPetrolLitrePer100km() {
        return petrolLitrePer100km;
    }

    public void setPetrolLitrePer100km(double petrolLitrePer100km) {
        this.petrolLitrePer100km = petrolLitrePer100km;
    }

    public double getPetrolPrice() {
        return petrolPrice;
    }

    public void setPetrolPrice(double petrolPrice) {
        this.petrolPrice = petrolPrice;
    }
}
