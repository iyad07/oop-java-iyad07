package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        Car car = new Car("C1", "Toyota Corolla", 50,true);
        MotorCycle motorcycle = new MotorCycle("M1", "Yamaha R1", 30,true);
        Truck truck = new Truck("T1", "Ford F-150", 100,true);

        agency.addVehicle(car);
        agency.addVehicle(motorcycle);
        agency.addVehicle(truck);

        Customer customer = new Customer("CU1", "John Doe");

        car.rent(customer, 5);
        motorcycle.rent(customer, 2);
        truck.rent(customer, 3);
        car.rent(customer, 10);

        for (int i=0; i<customer.getRentalHistory().size(); i++){
            System.out.println(customer.getRentalHistory().get(i));
        }

        car.returnVehichle();

        //agency.generateReport();
    }
}