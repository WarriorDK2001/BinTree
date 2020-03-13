
public class Item {
    public int key;
    public String value;
    public Item right;
    public Item left;

    public Item(int key,String value) {
        this.key = key;
        this.value = value;
        this.right = null;
        this.left = null;
    }
}
