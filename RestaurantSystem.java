public class RestaurantSystem {
    private OrderList orderList;
private FoodQueue foodQueue;
private CompletedOrderStack completedOrderStack;

public RestaurantSystem() {
    orderList = new OrderList();
    foodQueue = new FoodQueue();
    completedOrderStack = new CompletedOrderStack();
}

public void addOrder(Order order) {
    orderList.addOrder(order);
}

public void addFoodRequest(FoodRequest request) {
    foodQueue.enqueue(request);
}

public FoodRequest processFoodRequest() {
    return foodQueue.dequeue();
}

public void addCompletedOrder(CompletedOrderRecord record) {
    completedOrderStack.push(record);
}

public void displayOrders() {
    System.out.println("\nActive Orders:");
    orderList.printList();
}

public void displayFoodRequests() {
    System.out.println("\nFood Preparation Queue:");
    foodQueue.printQueue();
}

public void displayCompletedOrders() {
    System.out.println("\nCompleted Orders:");
    completedOrderStack.printStack();
}

public int getOrderCount() {
    return orderList.size();
}

public int getFoodRequestCount() {
    return foodQueue.size();
}

public int getCompletedOrderCount() {
    return completedOrderStack.size();
}
}