package exceptions;

import oop.personLecture;

import java.util.List;

public class Cashier extends personLecture {
    List<TransactionItem> items;

    public Cashier(String fName, String lName, boolean alive, List<TransactionItem> items) {
        super(fName, lName, alive);
        this.items = items;
    }

    private double getTotalFromItems(){
        double transactionTotal = 0;
        for(TransactionItem item: this.items){
            transactionTotal += item.getPrice();
        }
        return transactionTotal;
    }

    public boolean askCustomerForMoney(Customer customer) throws Exception{
        double transactionTotal = this.getTotalFromItems();
        //without throws exception on the method, it will throw an error.
        double moneyFromCustomer = customer.giveTotal(transactionTotal);
        if (moneyFromCustomer == transactionTotal){
            return true;
        } else {
            return false;
        }
    }
}
