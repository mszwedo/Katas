package BinaryTree;


public class BinaryNode {

    private int data;
    private BinaryNode parent;
    private BinaryNode left;
    private BinaryNode right;

    public BinaryNode(int data, BinaryNode parent, BinaryNode left, BinaryNode right)
    {
        this.data = data;
        this.parent = parent;
        this.left = left;
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getParent() {
        return parent;
    }

    public void setParent(BinaryNode parent) {
        this.parent = parent;
    }
}
