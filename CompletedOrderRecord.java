// This class stores information about a completed order.
public class CompletedOrderRecord {
    // These variables store the order ID, customer name, and completion time.
    private int orderId;
    private String customerName;
    private long completionTime;

    // This constructor sets the information for a completed order.
    public CompletedOrderRecord(int orderId, String customerName, long completionTime) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.completionTime = completionTime;
    }

    // This method returns the order ID.
    public int getOrderId() {
        return orderId;
    }

    // This method returns the customer's name.
    public String getCustomerName() {
        return customerName;
    }

    // This method returns the completion time.
    public long getCompletionTime() {
        return completionTime;
    }

    // This method prints the completed order information to the console.
    public void display() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Completion Time: " + completionTime);
    }
}