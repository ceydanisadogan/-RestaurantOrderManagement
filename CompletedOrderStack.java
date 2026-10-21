// This class stores completed order records using a stack.
public class CompletedOrderStack {
    // top points to the last added record, and size counts the records.
    private CompletedOrderNode top;
    private int size;

    // This constructor creates an empty stack.
    public CompletedOrderStack() {
        top = null;
        size = 0;
    }

    // This method adds a new record to the top of the stack.
    public void push(CompletedOrderRecord record) {
        CompletedOrderNode newNode = new CompletedOrderNode(record);

        // Connect the new node to the previous top node.
        newNode.next = top;

        // Make the new node the top of the stack.
        top = newNode;
        size++;
    }

    // This method removes and returns the top record from the stack.
    public CompletedOrderRecord pop() {
        // Return null if the stack is empty.
        if (top == null) {
            return null;
        }

        CompletedOrderRecord removedRecord = top.data;

        // Move top to the next node to remove the current top record.
        top = top.next;
        size--;
        return removedRecord;
    }

    // This method returns the top record without removing it.
    public CompletedOrderRecord peek() {
        // Return null if the stack is empty.
        if (top == null) {
            return null;
        }

        return top.data;
    }

    // This method returns the number of records in the stack.
    public int size() {
        return size;
    }

    // This method checks whether the stack is empty.
    public boolean isEmpty() {
        return top == null;
    }

    // This method prints all completed order records in the stack.
    public void printStack() {
        CompletedOrderNode current = top;

        // Check whether the stack is empty before printing.
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