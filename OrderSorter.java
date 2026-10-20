public class OrderSorter {
    public static void sortByWaitingTime(Order[] orders) {
    int n = orders.length;

    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {

            if (orders[j].getOrderTime() > orders[j + 1].getOrderTime()) {
                Order temp = orders[j];
                orders[j] = orders[j + 1];
                orders[j + 1] = temp;
            }
        }
    }
}
}