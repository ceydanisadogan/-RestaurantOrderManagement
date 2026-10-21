/*
 * This class represents a node in the order linked list.
 * Each node stores an order and a reference to the next node.
 */
public class OrderNode {
    Order order;
    OrderNode next;

    public OrderNode(Order order) {
        this.order = order;
        this.next = null;
    }
}