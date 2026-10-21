// This class represents a node that stores a completed order record.
public class CompletedOrderNode {
    CompletedOrderRecord data;

    // This variable points to the next node in the list.
    CompletedOrderNode next;

    // This constructor creates a new node with a completed order record.
    public CompletedOrderNode(CompletedOrderRecord data) {
        this.data = data;

        // The next reference is set to null because the node is not connected to another node yet.
        this.next = null;
    }
}