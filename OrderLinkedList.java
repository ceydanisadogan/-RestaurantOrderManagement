public class OrderLinkedList {
    private OrderNode head;
    private OrderNode tail;
    private int size;

    public OrderLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addOrder(Order order) {
        OrderNode newNode = new OrderNode(order);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public void displayOrders() {
        if (head == null) {
            System.out.println("No orders available.");
            return;
        }

        OrderNode current = head;

        while (current != null) {
            current.order.displayOrder();
            System.out.println("--------------------");
            current = current.next;
        }
    }

    public int getSize() {
        return size;
    }
}