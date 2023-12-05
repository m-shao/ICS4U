import java.util.ArrayList;

public class Forest {
    // instance variables
    private ArrayList<Tree> trees = new ArrayList<Tree>();

    // default constructor supplied automatically by java

    // methods
    public void setTree(Tree tree) {
        trees.add(tree);
    }

    public Tree getTree(int treeInd) {
        return trees.get(treeInd);
    }

    @Override
    public String toString() {
        if (trees.isEmpty()) {
            return "No trees in this forest";
        } else {
            String allTrees = "Forest:\n";

            for (int i = 0; i < trees.size(); i++) {
                allTrees += "Tree " + (i + 1) + ": " + trees.get(i) + "\n";
            }

            return allTrees;
        }
    }
}