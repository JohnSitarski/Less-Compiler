package jsitarski.datastructures.trees;

/**
 * Created by sitar on 13/12/2017.
 */
public class AbstractSyntaxTree<Type> {
    private TreeNode<Type> root;

    public AbstractSyntaxTree(final TreeNode<Type> root) {
        this.root = root;
    }


    public TreeNode<Type> getRoot() {
        return root;
    }


    public String prettyPrint() {
        return null;
    }


}
