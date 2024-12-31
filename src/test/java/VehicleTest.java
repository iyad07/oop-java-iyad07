import org.example.Car;
import org.example.MotorCycle;
import org.example.Truck;
import org.example.Vehicle;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    void testCarRentalCost() {
        Vehicle car = new Car("C1", "Toyota Corolla", 50,true);
        assertEquals(265.0, car.calculateRentalCost(5)); // 5 days * 50 + 15 insurance fee
    }

    @Test
    void testMotorcycleRentalCost() {
        Vehicle motorcycle = new MotorCycle("M1", "Yamaha R1", 30,true);
        assertEquals(155.0, motorcycle.calculateRentalCost(5)); // 5 days * 30 + 5 helmet fee
    }

    @Test
    void testTruckRentalCost() {
        Vehicle truck = new Truck("T1", "Ford F-150", 100,true);
        assertEquals(550.0, truck.calculateRentalCost(5)); // 5 days * 100 + 50 cargo fee
    }

    @Test
    void testVehicleAvailability() {
        Vehicle car = new Car("C1", "Toyota Corolla", 50,true);
        assertTrue(car.isAvailable());
        car.setAvailable(false);
        assertFalse(car.isAvailable());
    }
}
