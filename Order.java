// This class stores the information about a restaurant order.
public class Order {
    // These variables store the order ID, customer name, table number, item count, and order time.
    private int orderId;
    private String customerName;
    private int tableNumber;
    private int itemCount;
    private long orderTime;

    // This constructor sets the information for a new order.
    public Order(int orderId, String customerName, int tableNumber,
                 int itemCount, long orderTime) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.tableNumber = tableNumber;
        this.itemCount = itemCount;
        this.orderTime = orderTime;
    }

    // This method returns the order ID.
    public int getOrderId() {
        return orderId;
    }

    // This method returns the customer's name.
    public String getCustomerName() {
        return customerName;
    }

    // This method returns the table number.
    public int getTableNumber() {
        return tableNumber;
    }

    // This method returns the number of items in the order.
    public int getItemCount() {
        return itemCount;
    }

    // This method returns the order time.
    public long getOrderTime() {
        return orderTime;
    }

    // This method prints the order information to the console.
    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Table: " + tableNumber);
        System.out.println("Number of items: " + itemCount);
        System.out.println("Order time: " + orderTime);
    }
}