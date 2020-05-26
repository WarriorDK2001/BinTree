
public class Item {
    public int key;
    public int value;
    public Item right;
    public Item left;

    public Item(int key, int value) {
        this.key = key;
        this.value = value;
        this.right = null;
        this.left = null;
    }
}
