package org.example;

public class MotorCycle extends Vehicle implements Rentable {

    public MotorCycle(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        super(vehicleId, model, baseRentalRate, isAvailable);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;
    }

    @Override
    public void rent(Customer customer, int daysRented) {
        setAvailable(true);
        customer.addRentalTransaction(new RentalTransaction(daysRented, this));
    }

    @Override
    public void returnVehichle() {
        setAvailable(true);
    }
}
