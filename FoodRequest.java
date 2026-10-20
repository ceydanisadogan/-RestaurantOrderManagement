public class FoodRequest {
    private int orderId;
    private int foodRequestCount;
    private int requestTime;

    public FoodRequest(int orderId, int foodRequestCount, int requestTime) {
        this.orderId = orderId;
        this.foodRequestCount = foodRequestCount;
        this.requestTime = requestTime;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getFoodRequestCount() {
        return foodRequestCount;
    }

    public int getRequestTime() {
        return requestTime;
    }

    public void display() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Food Request Count: " + foodRequestCount);
        System.out.println("Request Time: " + requestTime);
    }
}