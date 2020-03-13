public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.AddToTree(new Item(6,"а"));
        tree.AddToTree(new Item(4,"б"));
        tree.AddToTree(new Item(10,"в"));
        tree.AddToTree(new Item(12,"г"));
        tree.AddToTree(new Item(2,"д"));
        tree.AddToTree(new Item(7,"е"));
        tree.AddToTree(new Item(5,"ё"));
        System.out.println(tree.get(6));
        System.out.println(tree.get(4));
        System.out.println(tree.get(10));

    }
}
