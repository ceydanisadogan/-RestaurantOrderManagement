// This class brings together the data structures used in the restaurant system.
public class RestaurantSystem {
    // These data structures manage active orders, food requests, and completed orders.
    private OrderList orderList;
    private FoodQueue foodQueue;
    private CompletedOrderStack completedOrderStack;

    // This constructor creates an empty list, queue, and stack.
    public RestaurantSystem() {
        orderList = new OrderList();
        foodQueue = new FoodQueue();
        completedOrderStack = new CompletedOrderStack();
    }

    // This method adds a new order to the active order list.
    public void addOrder(Order order) {
        orderList.addOrder(order);
    }

    // This method adds a food request to the queue.
    public void addFoodRequest(FoodRequest request) {
        foodQueue.enqueue(request);
    }

    // This method processes the first food request by removing it from the queue.
    public FoodRequest processFoodRequest() {
        return foodQueue.dequeue();
    }

    // This method removes an order from the active order list by its ID.
    public boolean removeOrder(int orderId) {
        return orderList.removeOrder(orderId);
    }

    // This method adds a completed order record to the stack.
    public void addCompletedOrder(CompletedOrderRecord record) {
        completedOrderStack.push(record);
    }

    // This method displays all active orders.
    public void displayOrders() {
        System.out.println("\nActive Orders:");
        orderList.printList();
    }

    // This method displays all food requests waiting in the queue.
    public void displayFoodRequests() {
        System.out.println("\nFood Preparation Queue:");
        foodQueue.printQueue();
    }

    // This method displays the completed order records.
    public void displayCompletedOrders() {
        System.out.println("\nCompleted Orders:");
        completedOrderStack.printStack();
    }

    // This method returns the number of active orders.
    public int getOrderCount() {
        return orderList.size();
    }

    // This method returns the active orders as an array.
    public Order[] getActiveOrders() {
        return orderList.toArray();
    }

    // This method returns the number of food requests in the queue.
    public int getFoodRequestCount() {
        return foodQueue.size();
    }

    // This method returns the number of completed order records.
    public int getCompletedOrderCount() {
        return completedOrderStack.size();
    }
}