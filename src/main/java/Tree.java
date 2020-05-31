
public class Tree {
    public Item head;
    public int size;

    public Tree() {
        head = null;
        size = 0;
    }

    public void addToTree(Item item) {
        if (head == null) {
            head = item;
            size++;
        } else {
            if (item.key > head.key)
                addToBranch(null, head, item);
            else
                addToBranch(head, null, item);
        }
    }

    public void addToBranch(Item left, Item right, Item item) {
        if (right == null) {
            if ((item.key > left.key) && (left.right == null)) {
                left.right = item;
                size++;
            } else {
                if ((item.key < left.key) && (left.left == null)) {
                    left.left = item;
                    size++;
                } else {
                    if (item.key > left.key) addToBranch(null, left.right, item);
                    else addToBranch(left.left, null, item);
                }
            }
        } else if ((item.key > right.key) && (right.right == null)) {
            right.right = item;
            size++;
        } else {
            if ((item.key < right.key) && (right.left == null)) {
                right.left = item;
                size++;
            } else {
                if (item.key > right.key) addToBranch(null, right.right, item);
                else addToBranch(right.left, null, item);
            }
        }
    }

    public int get(int key) {
        if (size > 0) {
            if (head.key == key) {
                return head.value;
            } else if (head.key < key) {
                return getFromBranch(key, null, head.right);
            } else
                return getFromBranch(key, head.left, null);
        }
        return 0;
    }


    public int getFromBranch(int key, Item left, Item right) {
        if (left == null) {
            if (key == right.key) {
                return right.value;
            } else if (right.key < key) {
                return getFromBranch(key, null, right.right);
            } else
                return getFromBranch(key, right.left, null);
        } else if (key == left.key) {
            return left.value;
        } else if (left.key < key) {
            return getFromBranch(key, null, left.right);
        } else
            return getFromBranch(key, left.left, null);
    }

    public void deleteFromTree(int key) {
        Item item1 = head;
        Item item2 = null;
        while (item1 != null) {
            int difference = key - item1.key;
            if (difference == 0) break;
            else {
                item2 = item1;
                if (difference < 0) item1 = item1.left;
                else item1 = item1.right;
            }
        }
        if (item1 == null) return;
        if (item1.right == null) {
            if (item2 == null) head = item1.left;
            else {
                if (item1 == item2.left) item2.left = item1.left;
                else item2.right = item1.left;
            }
        } else {
            Item farleft = item1.right;
            item2 = null;
            while (farleft.left != null) {
                item2 = farleft;
                farleft = farleft.left;
            }
            if (item2 != null) item2.left = farleft.right;
            else item1.right = farleft.right;
            item1.key = farleft.key;
            item1.value = farleft.value;
        }
    }
}