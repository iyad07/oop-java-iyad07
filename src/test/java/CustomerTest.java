import org.example.Car;
import org.example.Customer;
import org.example.RentalTransaction;
import org.example.Vehicle;
import org.junit.jupiter.api.*;

import static org.junit.Assert.assertEquals;

class CustomerTest {
    @Test
    void testCustomerRentalHistory() {
        Customer customer = new Customer("CU1", "John Doe");
        Vehicle car = new Car("C1", "Toyota Corolla", 50,true);

        RentalTransaction transaction = new RentalTransaction(5,car);
        customer.addRentalTransaction(transaction);

        Assertions.assertEquals(1, customer.getRentalHistory().size());
        Assertions.assertEquals(car, customer.getRentalHistory().get(0).getVehichle());
    }
}