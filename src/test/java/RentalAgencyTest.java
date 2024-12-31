import org.example.Car;
import org.example.MotorCycle;
import org.example.RentalAgency;
import org.example.Vehicle;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class RentalAgencyTest {
    @Test
    void testAddAndFindVehicle() {
        RentalAgency agency = new RentalAgency();
        Vehicle car = new Car("C1", "Toyota Corolla", 50,true);

        agency.addVehicle(car);

        assertEquals(car, agency.findVehicleById("C1"));
    }

    @Test
    void testGenerateReport() {
        RentalAgency agency = new RentalAgency();
        Vehicle car = new Car("C1", "Toyota Corolla", 50,true);
        agency.addVehicle(car);
        Vehicle motorcycle = new MotorCycle("M1", "Yamaha R1", 30,true);
        agency.addVehicle(motorcycle);

        assertDoesNotThrow(agency::generateReport);
    }
}