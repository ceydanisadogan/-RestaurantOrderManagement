public class CompletedOrderStack {
    private CompletedOrderNode top;
    private int size;

    public CompletedOrderStack() {
        top = null;
        size = 0;
    }

    public void push(CompletedOrderRecord record) {
        CompletedOrderNode newNode = new CompletedOrderNode(record);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public CompletedOrderRecord pop() {
        if (top == null) {
            return null;
        }

        CompletedOrderRecord removedRecord = top.data;
        top = top.next;
        size--;
        return removedRecord;
    }

    public CompletedOrderRecord peek() {
        if (top == null) {
            return null;
        }

        return top.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        CompletedOrderNode current = top;

        if (current == null) {
            System.out.println("The completed order stack is empty.");
            return;
        }

        while (current != null) {
            current.data.display();
            System.out.println("--------------------");
            current = current.next;
        }
    }
}