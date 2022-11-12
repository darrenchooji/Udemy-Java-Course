package Section08CodingExercises.Banking;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.name = bankName;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name) {
        Branch branch = findBranch(name);
        if (branch == null) {
            branch = new Branch(name);
            this.branches.add(branch);
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        } else {
            return (branch.newCustomer(customerName, initialTransaction));
        }
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        } else {
            return (branch.addCustomerTransaction(customerName, transaction));
        }
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch "+branch.getName());
            ArrayList<Customer> customers = branch.getCustomers();
            for (Customer customer : customers) {
                System.out.println("Customer: "+customer.getName()+"["+(customers.indexOf(customer)+1)+"]");
                if (printTransactions) {
                    ArrayList<Double> transactions = customer.getTransactions();
                    System.out.println("Transactions");
                    for (Double transaction : transactions) {
                        System.out.println("["+(transactions.indexOf(transaction)+1)+"]  Amount "+transaction);
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    private Branch findBranch(String name) {
        Branch branch = null;
        for (Branch branchInfo : branches) {
            if (branchInfo.getName().equalsIgnoreCase(name)) {
                branch = branchInfo;
            }
        }
        return branch;
    }
}
