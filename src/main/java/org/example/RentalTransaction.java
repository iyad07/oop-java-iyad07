package org.example;

public class RentalTransaction {
    private final int days;
    private final Vehicle vehicle;
    public RentalTransaction(int days, Vehicle vehicle) {
        this.days = days;
        this.vehicle = vehicle;
    }
    public int getDays() {
        return days;
    }
    public Vehicle getVehichle() {
        return vehicle;
    }

    @Override
    public String toString() {
        return String.format("Vehicle: %s, Days: %d", vehicle.getModel(), days);
    }
}
