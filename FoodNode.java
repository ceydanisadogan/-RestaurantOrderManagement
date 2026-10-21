/*

 * This class represents a node in the food request queue.

 * Each node stores a food request and a link to the next node.

 */
public class FoodNode {
    FoodRequest data;
    FoodNode next;

    public FoodNode(FoodRequest data) {
        this.data = data;
        this.next = null;
    }
}