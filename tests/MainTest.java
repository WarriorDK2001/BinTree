import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void getCheck() {
        Tree tree = new Tree();
        tree.addToTree(new Item(6, 7));
        tree.addToTree(new Item(4, 9));
        tree.addToTree(new Item(10, 11));
        tree.addToTree(new Item(12, 18));
        tree.addToTree(new Item(2, 20));
        tree.addToTree(new Item(7, 2));
        tree.addToTree(new Item(5, 4));
        assertEquals(tree.get(6), 7);
    }

    @Test
    public void deleteCheck() {
        Tree tree = new Tree();
        tree.addToTree(new Item(6, 7));
        tree.addToTree(new Item(4, 9));
        tree.addToTree(new Item(10, 11));
        tree.addToTree(new Item(12, 18));
        tree.addToTree(new Item(2, 20));
        tree.addToTree(new Item(7, 2));
        tree.addToTree(new Item(5, 4));
        tree.deleteFromTree(7);
        Assertions.assertThrows(NullPointerException.class,()->{tree.get(7);}
        );
    }
}