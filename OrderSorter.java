// This class sorts orders based on their waiting time.
public class OrderSorter {

    // This method sorts orders from the earliest order time to the latest using Bubble Sort.
    public static void sortByWaitingTime(Order[] orders) {
        int n = orders.length;

        // Repeat the passes until the orders are sorted.
        for (int i = 0; i < n - 1; i++) {

            // Compare neighboring orders that have not been sorted yet.
            for (int j = 0; j < n - i - 1; j++) {

                // Swap the orders if the first order time is greater than the next one.
                if (orders[j].getOrderTime() > orders[j + 1].getOrderTime()) {

                    // Use a temporary variable to swap the two orders.
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }
}