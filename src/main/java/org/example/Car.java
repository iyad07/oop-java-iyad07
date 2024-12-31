package org.example;

public class Car extends Vehicle implements Rentable {
    public Car(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        super(vehicleId, model, baseRentalRate, isAvailable);
    }

    @Override
    public double calculateRentalCost(int days) {
        double insuranceFee = 15.0;
        return (getBaseRentalRate() * days)+ insuranceFee;
    }
    @Override
    public void rent(Customer customer, int daysRented) {
        setAvailable(false);
        customer.addRentalTransaction(new RentalTransaction(daysRented, this));
    }

    @Override
    public void returnVehichle() {
        setAvailable(true);
    }

}
