package org.example;

public class Truck extends Vehicle implements Rentable {


    public Truck(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        super(vehicleId, model, baseRentalRate, isAvailable);
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

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;
    }
}
