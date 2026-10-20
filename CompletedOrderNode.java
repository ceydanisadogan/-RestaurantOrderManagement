public class CompletedOrderNode {
    CompletedOrderRecord data;
    CompletedOrderNode next;

    public CompletedOrderNode(CompletedOrderRecord data) {
        this.data = data;
        this.next = null;
    }
}