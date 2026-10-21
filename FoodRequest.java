// This class stores information about a food request.
public class FoodRequest {
    // These variables store the order ID, number of food items requested, and request time.
    private int orderId;
    private int foodRequestCount;
    private int requestTime;

    // This constructor sets the information for a new food request.
    public FoodRequest(int orderId, int foodRequestCount, int requestTime) {
        this.orderId = orderId;
        this.foodRequestCount = foodRequestCount;
        this.requestTime = requestTime;
    }

    // This method returns the order ID.
    public int getOrderId() {
        return orderId;
    }

    // This method returns the number of food items requested.
    public int getFoodRequestCount() {
        return foodRequestCount;
    }

    // This method returns the request time.
    public int getRequestTime() {
        return requestTime;
    }

    // This method prints the food request information to the console.
    public void display() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Food Request Count: " + foodRequestCount);
        System.out.println("Request Time: " + requestTime);
    }
}