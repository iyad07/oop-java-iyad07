package org.example;

public abstract class Vehicle {
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    public Vehicle(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = isAvailable;
    }
    public String getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getBaseRentalRate() {
        return baseRentalRate;
    }
    public void setBaseRentalRate(double baseRentalRate) {
        this.baseRentalRate = baseRentalRate;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean availability) {
        isAvailable = availability;
    }

    public abstract double calculateRentalCost(int days);

    public String toString() {
        return String.format("Vehicle ID: %s, Model: %s, Rate: %.2f, Available: %b",
                vehicleId, model, baseRentalRate, isAvailable);
    }
}
