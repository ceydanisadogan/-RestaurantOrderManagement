// This class manages food requests using a FIFO queue.
public class FoodQueue {
    // front points to the first request, rear points to the last request, and size counts the requests.
    private FoodNode front;
    private FoodNode rear;
    private int size;

    // This constructor creates an empty queue.
    public FoodQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    // This method adds a new food request to the end of the queue.
    public void enqueue(FoodRequest request) {
        FoodNode newNode = new FoodNode(request);

        // If the queue is empty, the new node becomes both the front and rear.
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            // Connect the current last node to the new node.
            rear.next = newNode;

            // Update rear to point to the new last node.
            rear = newNode;
        }

        size++;
    }

    // This method removes and returns the first food request in the queue.
    public FoodRequest dequeue() {
        // Return null if there are no requests in the queue.
        if (front == null) {
            return null;
        }

        FoodRequest removedRequest = front.data;

        // Move front to the next node to remove the first request.
        front = front.next;

        // If the queue becomes empty, rear must also be set to null.
        if (front == null) {
            rear = null;
        }

        size--;
        return removedRequest;
    }

    // This method returns the number of requests in the queue.
    public int size() {
        return size;
    }

    // This method checks whether the queue is empty.
    public boolean isEmpty() {
        return front == null;
    }

    // This method prints all food requests in the queue.
    public void printQueue() {
        FoodNode current = front;

        // Check whether the queue is empty before printing.
        if (current == null) {
            System.out.println("The food request queue is empty.");
            return;
        }

        while (current != null) {
            current.data.display();
            System.out.println("--------------------");
            current = current.next;
        }
    }
}