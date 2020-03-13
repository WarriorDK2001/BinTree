public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.AddToTree(new Item(6,"шесть"));
        tree.AddToTree(new Item(4,"четыре"));
        tree.AddToTree(new Item(10,"десять"));
        tree.AddToTree(new Item(12,"двенадцать"));
        tree.AddToTree(new Item(2,"два"));
        tree.AddToTree(new Item(7,"семь"));
        tree.AddToTree(new Item(5,"пять"));
        System.out.println(tree.get(6));
        System.out.println(tree.get(4));
        System.out.println(tree.get(10));
        System.out.println(tree.get(12));
        System.out.println(tree.get(2));
        System.out.println(tree.get(7));
        System.out.println(tree.get(5));


    }
}
