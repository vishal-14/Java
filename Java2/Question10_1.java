import java.util.LinkedList;
import java.util.Queue;



class Barista {
    void getNextOrder() {
        // Accesses order queue for next order
        System.out.println("Getting the next order from the order queue");
    }
    void prepareCoffee() {
        // Takes some time to prepare item(s) in order
        System.out.println("Preparing your coffee");
    }
    void serveCoffee() {
        // Notifies customer, serves order items when ready
        System.out.println("Enjoy your coffee!");
    }
    Barista() {
        System.out.println("Barista");
    }
}


class CafeOrder {
    // String itemName;
    // double itemPrice;

    CafeOrder(int orderID) {
        // Creates a new order
        addOrderToList(orderID++);
    }

    void addOrderToList(int id) {
        // Adds new order to queue of orders
    }
}



class Cashier {
    int createOrder() {
        // Creates a new order, returns its ID
        new CafeOrder(1);
        return 1;
    }
    Cashier() {
        System.out.println("Cashier");
    }

}


class Customer {
    int tokenNumber;

    // Calls createOrder() in Cashier
    void placeOrder(Cashier cashier) {
        tokenNumber = cashier.createOrder();
    }
    void enjoyDrink() {
        // Notified by barista when order ready
        System.out.println("Thanks for the coffee!");
    }
    Customer() {
        System.out.println("Customer");
    }
}


/**
 * Question 10: Design classes having attributes and method (only skeleton) for
 * a coffee shop. There are three different actors in our scenario -
 * Cashier, Customer, and Barista, and they have different actions
 */



public class Question10_1 {
    private Barista barista;
    private Cashier cashier;
    Queue<CafeOrder> cafeOrderQueue;
    Queue<Customer> customerQueue;

    Question10_1() {
        System.out.println("Barista Cafe");
        this.cafeOrderQueue = new LinkedList<>();
    }


    public void setBarista(Barista barista) {
        this.barista = barista;
    }

    public void setCustomerQueue(Queue<Customer> customerQueue) {
        this.customerQueue = customerQueue;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    public void startServingCustomers(Cashier cashier) {
        for (Customer c : this.customerQueue) {
            c.placeOrder(cashier);
        }
    }

    public static void main(String[] args) {
        Question10_1 javaCafe = new Question10_1();
        Barista barista = new Barista();
        Cashier cashier = new Cashier();
        javaCafe.setCashier(cashier);
        javaCafe.setBarista(barista);
        // Create customers
        Customer customerOne = new Customer();
        Customer customerTwo = new Customer();
        Customer customerThree = new Customer();
        Customer customerFour = new Customer();
        Queue<Customer> customerQueue = new LinkedList<>();
        customerQueue.add(customerOne);
        customerQueue.add(customerTwo);
        customerQueue.add(customerThree);
        customerQueue.add(customerFour);
        javaCafe.setCustomerQueue(customerQueue);
        // Begin operations
        javaCafe.startServingCustomers(cashier);
    }
}