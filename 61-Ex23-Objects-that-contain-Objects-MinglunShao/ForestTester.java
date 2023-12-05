public class ForestTester {
    public static void run() {
        System.out.println("\n------------Forest Tester------------\n");

        Forest forest = new Forest();
        Tree tree1 = new Tree(1.0, 2.0, 8.0, 10.0, 1.0, 2.0, 3.0);
        Tree tree2 = new Tree(10.0, 1.0, 1.0, 2.0, 8.0, 2.0, 3.0);

        forest.setTree(tree1);
        forest.setTree(tree2);

        System.out.println(forest);

        System.out.println("The first tree in the forest is: " + forest.getTree(0));
    }
}