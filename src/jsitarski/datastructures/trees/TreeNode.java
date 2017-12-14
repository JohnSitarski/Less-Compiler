package jsitarski.datastructures.trees;

import java.util.ArrayList;

/**
 * Created by sitar on 13/12/2017.
 */
public class TreeNode<Type> {
    private Type data;
    private TreeNode<Type> parent;
    private ArrayList<Type> childList;


    public TreeNode(Type data, TreeNode<Type> parent, ArrayList<Type> childList) {
        this.data = data;
        this.parent = parent;
        this.childList = childList;
    }

    public TreeNode(Type data) {
        this(data, null, new ArrayList<>());
    }


    public TreeNode(Type data, TreeNode<Type> parent) {
        this(data, parent, new ArrayList<>());
    }


    public TreeNode<Type> getParent() {
        return parent;
    }

    public Type getData() {
        return data;
    }

    public ArrayList<Type> getChildList() {
        return childList;
    }
}
