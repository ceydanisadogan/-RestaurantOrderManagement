public class OrderStack {
    private OrderNode top;
    private int size;

    public OrderStack() {
        top = null;
        size = 0;
    }

    public void push(Order order) {
        OrderNode newNode = new OrderNode(order);

        newNode.next = top;
        top = newNode;

        size++;
    }

    public Order pop() {
        if (top == null) {
            System.out.println("The stack is empty.");
            return null;
        }

        Order removedOrder = top.order;
        top = top.next;

        size--;
        return removedOrder;
    }

    public Order peek() {
        if (top == null) {
            return null;
        }

        return top.order;
    }

    public int getSize() {
        return size;
    }

    public void displayStack() {
        if (top == null) {
            System.out.println("The stack is empty.");
            return;
        }

        OrderNode current = top;

        while (current != null) {
            current.order.displayOrder();
            System.out.println("--------------------");
            current = current.next;
        }
    }
}