public class OrderList {
    private OrderNode head;
    private int size;

    public OrderList() {
        head = null;
        size = 0;
    }

    public void addOrder(Order order) {
        OrderNode newNode = new OrderNode(order);

        if (head == null) {
            head = newNode;
        } else {
            OrderNode current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        size++;
    }

    public boolean removeOrder(int id) {
        if (head == null) {
            return false;
        }

        if (head.order.getOrderId() == id) {
            head = head.next;
            size--;
            return true;
        }

        OrderNode current = head;

        while (current.next != null) {
            if (current.next.order.getOrderId() == id) {
                current.next = current.next.next;
                size--;
                return true;
            }

            current = current.next;
        }

        return false;
    }

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

    public void printList() {
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
    public int size() {
        return size;
    }
}