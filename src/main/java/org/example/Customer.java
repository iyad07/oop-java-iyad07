package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Customer {
    private final String CustomerID;
    private final String CustomerName;
    private final List<RentalTransaction> rentalHistory = new ArrayList<>();
    public Customer(String customerID, String customerName) {
        this.CustomerID = customerID;
        this.CustomerName = customerName;
    }
    public String getCustomerID() {
        return CustomerID;
    }
    public String getCustomerName() {
        return CustomerName;
    }

    public void addRentalTransaction(RentalTransaction transaction) {
        rentalHistory.add(transaction);
    }

    public List<RentalTransaction> getRentalHistory() {
        return Collections.unmodifiableList(rentalHistory);
    }
}
