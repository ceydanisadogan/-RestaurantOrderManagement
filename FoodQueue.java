public class FoodQueue {
    private FoodNode front;
    private FoodNode rear;
    private int size;

    public FoodQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(FoodRequest request) {
        FoodNode newNode = new FoodNode(request);

        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
    }

    public FoodRequest dequeue() {
        if (front == null) {
            return null;
        }

        FoodRequest removedRequest = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        size--;
        return removedRequest;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void printQueue() {
        FoodNode current = front;

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