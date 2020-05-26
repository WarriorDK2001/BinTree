
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

    public void DeleteFromTree(int key) {
        if (size > 0) {
            if (head.key == key) {
                Delete(key, head);
            } else if (head.key < key) {
                FindRightDeleteElement(key, head.right);
            } else
                FindLeftDeleteElement(key, head.left);
        }
    }

    public void Delete(int key, Item item) {
        if ((item.right == null) && (item.left == null)) {
            item = null;
        } else if (item.right == null) {
            item = item.left;
        } else if (item.right.left == null) {
            item = item.right;
        } else FindAndDelete(item.right.left, item);
    }

    public void FindAndDelete(Item left, Item element) {
        if (left.left == null) {
            element = left;
        } else FindAndDelete(left.left, element);
    }

    public void FindRightDeleteElement(int key, Item right) {
        if (key == right.key) {
            Delete(key, right);
        } else if (right.key < key) {
            FindRightDeleteElement(key, right.right);
        } else
            FindLeftDeleteElement(key, right.left);
    }

    public void FindLeftDeleteElement(int key, Item left) {
        if (key == left.key) {
            Delete(key,left);
        } else if (left.key < key) {
            FindRightDeleteElement(key, left.right);
        } else
            FindLeftDeleteElement(key, left.left);
    }

    public void AddToLeft(Item left, Item item) {
        if ((item.key > left.key) && (left.right == null)) {
            left.right = item;
        } else {
            if ((item.key < left.key) && (left.left == null)) {
                left.left = item;
            } else {
                if (item.key > left.key) AddToRight(left.right, item);
                else AddToLeft(left.left, item);
            }
        }
    }

    public void AddToRight(Item right, Item item) {
        if ((item.key > right.key) && (right.right == null)) {
            right.right = item;
        } else {
            if ((item.key < right.key) && (right.left == null)) {
                right.left = item;
            } else {
                if (item.key > right.key) AddToRight(right.right, item);
                else AddToLeft(right.left, item);
            }
        }
    }

    public int get(int key) {
        if (size > 0) {
            if (head.key == key) {
                return head.value;
            } else if (head.key < key) {
                return getRight(key, head.right);
            } else
                return getLeft(key, head.left);
        }
        return 0;
    }


    public int getRight(int key, Item right) {
        if (key == right.key) {
            return right.value;
        } else if (right.key < key) {
            return getRight(key, right.right);
        } else
            return getLeft(key, right.left);
    }

    public int getLeft(int key, Item left) {
        if (key == left.key) {
            return left.value;
        } else if (left.key < key) {
            return getRight(key, left.right);
        } else
            return getLeft(key, left.left);
    }
}