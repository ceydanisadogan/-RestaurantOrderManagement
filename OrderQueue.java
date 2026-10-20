public class OrderQueue {
    private OrderNode front;
    private OrderNode rear;
    private int size;

    public OrderQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(Order order) {
        OrderNode newNode = new OrderNode(order);

        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
    }

    public Order dequeue() {
        if (front == null) {
            System.out.println("The order queue is empty.");
            return null;
        }

        Order removedOrder = front.order;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        size--;
        return removedOrder;
    }

    public void displayQueue() {
        if (front == null) {
            System.out.println("The order queue is empty.");
            return;
        }

        OrderNode current = front;

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