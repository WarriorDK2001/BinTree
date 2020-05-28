
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

    public int get(int key) {
        int allelementssize = size;
        if (allelementssize > 0) {
            if (head.key == key) {
                return head.value;
            } else if (head.key < key) {
                allelementssize--;
                return getRight(key, head.right, allelementssize);
            } else
                allelementssize--;
            return getLeft(key, head.left, allelementssize);
        }
        return 0;
    }


    public int getRight(int key, Item right, int allelementssize) {
        if (key == right.key) {
            return right.value;
        } else if (right.key < key) {
            allelementssize--;
            return getRight(key, right.right, allelementssize);
        } else
            allelementssize--;
        return getLeft(key, right.left, allelementssize);
    }

    public int getLeft(int key, Item left, int allelementssize) {
        if (key == left.key) {
            return left.value;
        } else if (left.key < key) {
            allelementssize--;
            return getRight(key, left.right, allelementssize);
        } else
            allelementssize--;
        return getLeft(key, left.left, allelementssize);
    }

    public void DeleteFromTree(int key) {
        Item item1 = head;
        Item item2 = null;
        while (item1 != null) {
            int difference = key - item1.key;
            if (difference == 0) break;
            else {
                item2 = item1;
                if (difference < 0)item1 = item1.left;
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