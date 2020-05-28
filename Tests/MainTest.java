import org.junit.jupiter.api.Test;

import java.rmi.UnexpectedException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void GetCheck() {
        Tree tree = new Tree();
        tree.AddToTree(new Item(6, 7));
        tree.AddToTree(new Item(4, 9));
        tree.AddToTree(new Item(10, 11));
        tree.AddToTree(new Item(12, 18));
        tree.AddToTree(new Item(2, 20));
        tree.AddToTree(new Item(7, 2));
        tree.AddToTree(new Item(5, 4));
        assertEquals(tree.get(6), 7);
    }

    @Test
    public void DeleteCheck() {
        Tree tree = new Tree();
        tree.AddToTree(new Item(6, 7));
        tree.AddToTree(new Item(4, 9));
        tree.AddToTree(new Item(10, 11));
        tree.AddToTree(new Item(12, 18));
        tree.AddToTree(new Item(2, 20));
        tree.AddToTree(new Item(7, 2));
        tree.AddToTree(new Item(5, 4));
        tree.DeleteFromTree(7);
        System.out.println("Если вылезла ошибка NullPointerException,то тест пройден");
        tree.get(7);
    }
}