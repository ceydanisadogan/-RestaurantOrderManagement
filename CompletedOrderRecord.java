public class CompletedOrderRecord {
    private int orderId;
    private String customerName;
    private long completionTime;

    public CompletedOrderRecord(int orderId, String customerName, long completionTime) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.completionTime = completionTime;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public long getCompletionTime() {
        return completionTime;
    }

    public void display() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Completion Time: " + completionTime);
    }
}