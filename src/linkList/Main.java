package linkList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Chung", 200.00);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(10.4);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(3);
        intList.add(4);
        intList.add(1,2);

    }
}
