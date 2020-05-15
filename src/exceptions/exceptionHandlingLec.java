package exceptions;

import java.util.ArrayList;

public class exceptionHandlingLec {
    public static void main(String[] args) throws Exception  {
//        int[] numbers = {1,2,3};
//        System.out.println(numbers[999]);
//        throw new Exception("something bad happened");
        //code wont compile
//        System.out.println("after the throw exception");

//        try {
//            System.out.println("Let's see...");
//            int result = 1 / 0;
//            System.out.println("I can divide by zero!");
//        } catch (Exception e) {
//            System.out.println("e = " + e);
//            System.out.println("Math still works!");
//        }
//        System.out.println("finishing up, goodbye!");
        ArrayList<TransactionItem> myItems = new ArrayList<>();
        myItems.add(new TransactionItem("childrens Tylenol", 4.99));

        Customer customer = new Customer("Douglas","hirsch", true, myItems);

        ArrayList<TransactionItem>cashierItems = new ArrayList<>();
        cashierItems.add( new TransactionItem("microwave", 200.00));
        cashierItems.add(myItems.get(0));

        Cashier cashier = new Cashier("Ken","malibu", true, cashierItems);
        try {
            System.out.println(cashier.askCustomerForMoney(customer));
        } catch(Exception e){
             cashier = new Cashier("Ken","malibu", true, myItems);
            System.out.println(cashier.askCustomerForMoney(customer));
        }

    }
}
