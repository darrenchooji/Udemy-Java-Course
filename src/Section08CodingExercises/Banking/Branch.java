package Section08CodingExercises.Banking;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        Customer customer = findCustomer(customerName);
        if (customer == null) {
            customer = new Customer(customerName, initialTransaction);
            this.customers.add(customer);
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer customer = findCustomer(customerName);
        if (customer == null) {
            return false;
        } else {
            customer.addTransaction(transaction);
            return true;
        }
    }

    private Customer findCustomer(String customerName) {
        Customer customer = null;
        for (Customer customerInfo : customers) {
            if (customerInfo.getName().equalsIgnoreCase(customerName)) {
                customer = customerInfo;
            }
        }
        return customer;
    }
}
