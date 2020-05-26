
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.AddToTree(new Item(6, 7));
        tree.AddToTree(new Item(4, 9));
        tree.AddToTree(new Item(10, 11));
        tree.AddToTree(new Item(12, 18));
        tree.AddToTree(new Item(2, 20));
        tree.AddToTree(new Item(7, 2));
        tree.AddToTree(new Item(5, 4));
        System.out.println(tree.get(6));
        System.out.println(tree.get(4));
        System.out.println(tree.get(10));
        System.out.println(tree.get(12));
        System.out.println(tree.get(2));
        System.out.println(tree.get(7));
        tree.DeleteFromTree(7);
        System.out.println(tree.get(5));
        System.out.println(tree.get(7));

        tree.get(6);
        tree.get(4);
        tree.get(10);
        tree.get(12);
        tree.get(2);
        tree.get(7);
    }
}
