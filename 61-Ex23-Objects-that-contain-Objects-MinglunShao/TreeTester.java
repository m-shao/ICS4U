public class TreeTester {
    public static void run() {
        System.out.println("\n------------Tree Tester------------\n");

        Tree tree = new Tree(2.0, 5.0, 10.0, 20.0, 0.0, 0.0, 0.0);

        System.out.println(tree);

        tree.grow(0.5);

        System.out.println("Tree is growing at a rate of 0.5...");

        System.out.println(tree);
    }
}