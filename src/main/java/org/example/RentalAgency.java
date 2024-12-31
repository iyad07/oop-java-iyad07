package org.example;

import java.util.HashMap;
import java.util.Map;

public class RentalAgency {
    private final Map<String, Vehicle> fleet = new HashMap<>();

    public void addVehicle(Vehicle vehicle) {
        fleet.put(vehicle.getVehicleId(), vehicle);
    }

    public Vehicle findVehicleById(String vehicleId) {
        return fleet.get(vehicleId);
    }

    public void generateReport() {
        fleet.values().forEach(System.out::println);
    }
}
