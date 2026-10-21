// This class manages orders using a singly linked list.
public class OrderList {
    // head points to the first node, and size stores the number of orders.
    private OrderNode head;
    private int size;

    // This constructor creates an empty list.
    public OrderList() {
        head = null;
        size = 0;
    }

    // This method adds a new order to the end of the list.
    public void addOrder(Order order) {
        OrderNode newNode = new OrderNode(order);

        // If the list is empty, the new node becomes the first node.
        if (head == null) {
            head = newNode;
        } else {
            OrderNode current = head;

            // Move through the list until the last node is reached.
            while (current.next != null) {
                current = current.next;
            }

            // Connect the last node to the new node.
            current.next = newNode;
        }

        size++;
    }

    // This method removes an order by its ID and returns whether it was found.
    public boolean removeOrder(int id) {
        // If the list is empty, there is no order to remove.
        if (head == null) {
            return false;
        }

        // If the first order matches, move head to the next node.
        if (head.order.getOrderId() == id) {
            head = head.next;
            size--;
            return true;
        }

        OrderNode current = head;

        // Search for the order by checking the next node.
        while (current.next != null) {
            if (current.next.order.getOrderId() == id) {
                // Skip the matching node to remove it from the list.
                current.next = current.next.next;
                size--;
                return true;
            }

            current = current.next;
        }

        return false;
    }

    // This method searches for an order by its ID and returns null if it is not found.
    public Order findOrder(int id) {
        OrderNode current = head;

        while (current != null) {
            if (current.order.getOrderId() == id) {
                return current.order;
            }

            current = current.next;
        }

        return null;
    }

    // This method prints all orders in the list.
    public void printList() {
        // Check if the list is empty before printing its contents.
        if (head == null) {
            System.out.println("No active orders.");
            return;
        }

        OrderNode current = head;

        while (current != null) {
            current.order.displayOrder();
            System.out.println("--------------------");
            current = current.next;
        }
    }

    // This method converts the linked list into an array for sorting.
    public Order[] toArray() {
        Order[] orders = new Order[size];
        OrderNode current = head;
        int index = 0;

        while (current != null) {
            orders[index] = current.order;
            current = current.next;
            index++;
        }

        return orders;
    }

    // This method returns the number of orders in the list.
    public int size() {
        return size;
    }
}