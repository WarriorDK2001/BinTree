
public class Tree {
    public Item head;
    public int size;

    public Tree() {
        head = null;
        size = 0;
    }

    public void AddToTree(Item item) {
        if (head == null) {
            head = item;
            size++;
        } else {
            if (item.key > head.key)
                AddToRight(head, item);
            else
                AddToLeft(head, item);
        }
    }


    public void AddToLeft(Item left, Item item) {
        if ((item.key > left.key) && (left.right == null)) {
            left.right = item;
            size++;
        } else {
            if ((item.key < left.key) && (left.left == null)) {
                left.left = item;
                size++;
            } else {
                if (item.key > left.key) AddToRight(left.right, item);
                else AddToLeft(left.left, item);
            }
        }
    }

    public void AddToRight(Item right, Item item) {
        if ((item.key > right.key) && (right.right == null)) {
            right.right = item;
            size++;
        } else {
            if ((item.key < right.key) && (right.left == null)) {
                right.left = item;
                size++;
            } else {
                if (item.key > right.key) AddToRight(right.right, item);
                else AddToLeft(right.left, item);
            }
        }
    }

    public String get(int key) {
        if (size > 0) {
            if (head.key == key) {
                return head.value;
            } else if (head.key < key) {
                return getRight(key, head.right);
            } else
                return getLeft(key, head.left);
        }
        return "";
    }


    public String getRight(int key, Item right) {
        if (key == right.key) {
            return right.value;
        } else if (right.key < key) {
            return getRight(key, right.right);
        } else
            return getLeft(key, right.left);
    }

    public String getLeft(int key, Item left) {
        if (key == left.key) {
            return left.value;
        } else if (left.key < key) {
            return getRight(key, left.right);
        } else
            return getLeft(key, left.left);
    }
}