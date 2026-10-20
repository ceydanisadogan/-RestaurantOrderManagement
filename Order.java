public class Order {
    private int orderId;
    private String customerName;
    private int tableNumber;
    private int itemCount;
    private long orderTime;

    public Order(int orderId, String customerName, int tableNumber,
                 int itemCount, long orderTime) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.tableNumber = tableNumber;
        this.itemCount = itemCount;
        this.orderTime = orderTime;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public int getItemCount() {
        return itemCount;
    }

    public long getOrderTime() {
        return orderTime;
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Table: " + tableNumber);
        System.out.println("Number of items: " + itemCount);
        System.out.println("Order time: " + orderTime);
    }
}