package exceptions;

import oop.personLecture;

import java.util.List;


public class Customer extends personLecture {
    List<TransactionItem> items ;
    double estimatedTotal;

    public Customer(String fName, String lName, boolean alive,List <TransactionItem> items) {
        super(fName, lName, alive);
        this.items = items;
        this.estimatedTotal = calculateEstimatedTotal();
    }

    private double calculateEstimatedTotal(){
        double total = 0;
        for (TransactionItem item: this.items){
            total += item.getPrice() * 1.1;
        }
        return total;
    }

    public double giveTotal(double totalRequest) throws Exception{
        if(totalRequest > this.estimatedTotal){
//            throw new Exception("Thats too much money, fix it!");
            throw new Exception(String.format("$%.2f is too much, please review the transaction. I was thinking it should be %.2f", totalRequest, this.estimatedTotal));
        }
        return totalRequest;
    }
}
