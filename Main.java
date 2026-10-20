public class Main {
public static void main(String[] args) {
        // TASK 1: ORDER LIST
    OrderList orderList = new OrderList();

    orderList.addOrder(new Order(101, "Ali", 1, 2, 1000L));
    orderList.addOrder(new Order(102, "Ayse", 2, 3, 2000L));
    orderList.addOrder(new Order(103, "Mehmet", 3, 1, 3000L));
    orderList.addOrder(new Order(104, "Zeynep", 4, 4, 4000L));
    orderList.addOrder(new Order(105, "Can", 5, 2, 5000L));

    System.out.println("TASK 1: ORDER LIST");
    System.out.println("\nInitial orders:");
    orderList.printList();

    System.out.println("\nRemoving order 103:");
    boolean removed = orderList.removeOrder(103);
    System.out.println("Order removed: " + removed);

    System.out.println("\nSearching for order 104:");
    Order foundOrder = orderList.findOrder(104);

    if (foundOrder != null) {
        foundOrder.displayOrder();
    } else {
        System.out.println("Order not found.");
    }

    System.out.println("\nFinal order list:");
    orderList.printList();
    System.out.println("Total active orders: " + orderList.size());

    // TASK 2: FOOD REQUEST QUEUE
    System.out.println("\n\nTASK 2: FOOD REQUEST QUEUE");

    FoodQueue foodQueue = new FoodQueue();

    foodQueue.enqueue(new FoodRequest(201, 2, 1000));
    foodQueue.enqueue(new FoodRequest(202, 1, 2000));
    foodQueue.enqueue(new FoodRequest(203, 3, 3000));
    foodQueue.enqueue(new FoodRequest(204, 2, 4000));
    foodQueue.enqueue(new FoodRequest(205, 1, 5000));
    foodQueue.enqueue(new FoodRequest(206, 4, 6000));
    foodQueue.enqueue(new FoodRequest(207, 2, 7000));
    foodQueue.enqueue(new FoodRequest(208, 1, 8000));

    System.out.println("\nInitial food request queue:");
    foodQueue.printQueue();

    System.out.println("\nProcessing first 3 food requests:");

    for (int i = 0; i < 3; i++) {
        FoodRequest processed = foodQueue.dequeue();

        if (processed != null) {
            System.out.println("Processed request:");
            processed.display();
            System.out.println("--------------------");
        }
    }

    System.out.println("\nRemaining food request queue:");
    foodQueue.printQueue();
    System.out.println("Remaining requests: " + foodQueue.size());

    // TASK 3: COMPLETED ORDER STACK
    System.out.println("\n\nTASK 3: COMPLETED ORDER STACK");

    CompletedOrderStack completedStack = new CompletedOrderStack();

    completedStack.push(new CompletedOrderRecord(301, "Ali", 9000));
    completedStack.push(new CompletedOrderRecord(302, "Ayse", 10000));
    completedStack.push(new CompletedOrderRecord(303, "Mehmet", 11000));
    completedStack.push(new CompletedOrderRecord(304, "Zeynep", 12000));
    completedStack.push(new CompletedOrderRecord(305, "Can", 13000));

    System.out.println("\nInitial completed order stack:");
    completedStack.printStack();

    System.out.println("\nMost recent completed order (peek):");
    CompletedOrderRecord recent = completedStack.peek();

    if (recent != null) {
        recent.display();
    }

    System.out.println("\nRemoving 2 records (pop):");

    for (int i = 0; i < 2; i++) {
        CompletedOrderRecord removedRecord = completedStack.pop();

        if (removedRecord != null) {
            System.out.println("Popped record:");
            removedRecord.display();
            System.out.println("--------------------");
        }
    }

    System.out.println("\nRemaining completed order stack:");
    completedStack.printStack();
    System.out.println("Remaining records: " + completedStack.size());

    // TASK 4: RESTAURANT SYSTEM INTEGRATION
    System.out.println("\n\nTASK 4: RESTAURANT SYSTEM INTEGRATION");

    RestaurantSystem restaurantSystem = new RestaurantSystem();

    // Add 10 orders to the restaurant system.
    Order[] orders = {
        new Order(401, "Ali", 1, 2, 5000L),
        new Order(402, "Ayse", 2, 3, 2000L),
        new Order(403, "Mehmet", 3, 1, 7000L),
        new Order(404, "Zeynep", 4, 4, 1000L),
        new Order(405, "Can", 5, 2, 6000L),
        new Order(406, "Elif", 6, 3, 3000L),
        new Order(407, "Ahmet", 7, 1, 9000L),
        new Order(408, "Ece", 8, 2, 4000L),
        new Order(409, "Mert", 9, 4, 8000L),
        new Order(410, "Selin", 10, 1, 1500L)
    };

    for (int i = 0; i < orders.length; i++) {
        restaurantSystem.addOrder(orders[i]);
    }

    restaurantSystem.displayOrders();

    // Add 5 food preparation requests.
    restaurantSystem.addFoodRequest(new FoodRequest(401, 2, 1000));
    restaurantSystem.addFoodRequest(new FoodRequest(402, 1, 2000));
    restaurantSystem.addFoodRequest(new FoodRequest(403, 3, 3000));
    restaurantSystem.addFoodRequest(new FoodRequest(404, 2, 4000));
    restaurantSystem.addFoodRequest(new FoodRequest(405, 1, 5000));

    restaurantSystem.displayFoodRequests();

    // Process 4 requests in FIFO order.
    System.out.println("\nProcessing 4 food requests:");

    for (int i = 0; i < 4; i++) {
        FoodRequest request = restaurantSystem.processFoodRequest();

        if (request != null) {
            request.display();
            System.out.println("--------------------");
        }
    }

    System.out.println("\nRemaining food requests:");
    restaurantSystem.displayFoodRequests();

    System.out.println("Remaining requests: "
            + restaurantSystem.getFoodRequestCount());

    // Add 2 completed order records.
    restaurantSystem.addCompletedOrder(
            new CompletedOrderRecord(401, "Ali", 10000));

    restaurantSystem.addCompletedOrder(
            new CompletedOrderRecord(402, "Ayse", 12000));

    restaurantSystem.displayCompletedOrders();

    System.out.println("Completed records: "
            + restaurantSystem.getCompletedOrderCount());

    // Sort orders by order time using Bubble Sort.
    System.out.println("\nOrders sorted by order time:");

    OrderSorter.sortByWaitingTime(orders);

    for (int i = 0; i < orders.length; i++) {
        orders[i].displayOrder();
        System.out.println("--------------------");
    }

    System.out.println("\nTotal integrated orders: "
            + restaurantSystem.getOrderCount());

    System.out.println("Integration completed successfully.");
}
}