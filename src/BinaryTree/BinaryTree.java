package BinaryTree;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree
{

    private BinaryNode root = null;
    private StringBuilder display;

    public BinaryTree()
    {

    }

    public void insert(int data)
    {
        if (root == null)  {
            BinaryNode node = new BinaryNode(data, null, null, null);
            root = node;
            return;
        }

        BinaryNode node = root;
        while (node != null)
        {
            if (data < node.getData()) {
                if(node.getLeft() == null) {
                    BinaryNode temp = new BinaryNode(data, node, null, null);
                    node.setLeft(temp);
                    return;
                }
                else
                    node = node.getLeft();
            }
            //if (data >= node.getData()) {
            else {
                if(node.getRight() == null) {
                    BinaryNode temp = new BinaryNode(data, node, null, null);
                    node.setRight(temp);
                    return;
                }
                else
                    node = node.getRight();
            }
        }
    }

    public boolean delete(int data)
    {
        if (root == null)
            return false;

        BinaryNode node = root;

        //Find Node
        while (node != null && node.getData() != data)
        {
            if(data < node.getData())
                node = node.getLeft();
            else
                node = node.getRight();
        }

        if (node == null)
            return false;

        //Delete Node

        //Leaf Node
        if (node.getLeft() == null && node.getRight() == null)
        {
            BinaryNode parent = node.getParent();
            if (parent == null)
                root = null;
            else if(data < parent.getData())
                parent.setLeft(null);
            else
                parent.setRight(null);
        }

        //Left child
        if (node.getLeft() != null && node.getRight() == null)
        {
            BinaryNode child = node.getLeft();
            swapData(node, child);
            node.setLeft(child.getLeft());
            node.setRight(child.getRight());
        }

        //Right child
        else if (node.getRight() != null && node.getLeft() == null)
        {
            BinaryNode child = node.getRight();
            swapData(node, child);
            node.setLeft(child.getLeft());
            node.setRight(child.getRight());
        }

        //Two Children
        else
        {
            BinaryNode child = node.getLeft();
            BinaryNode parent = null;

            while (child.getRight() != null)
            {
                parent = child;
                child = child.getRight();
            }

            if (parent == null)
            {
                swapData(node, child);
                node.setLeft(child.getLeft());
            }
            else
            {
                swapData(node, child);
                parent.setRight(child.getLeft());
            }
        }

        return true;
    }

    private void swapData(BinaryNode a, BinaryNode b)
    {
        int temp = a.getData();
        a.setData(b.getData());
        b.setData(temp);
    }

    ///////////////////////////////////////////////////////////////////////////////
    //Printing

    public String traverseRecursionPreOrder()
    {
        display = new StringBuilder();
        preOrder(root);
        return display.toString();
    }

    private void preOrder(BinaryNode node)
    {
        if (node != null)
        {
            display.append(node.getData() + " ");
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    public String traverseIterativePreOrder()
    {
        if (root == null)
            return "";

        display = new StringBuilder();

        Stack<BinaryNode> stack = new Stack<BinaryNode>();
        stack.push(root);

        while (!stack.empty())
        {
            BinaryNode node = stack.pop();

            if (node.getRight() != null)
                stack.push(node.getRight());

            if (node.getLeft() != null)
                stack.push(node.getLeft());

            display.append(node.getData() + " ");
        }

        return display.toString();
    }

    /////////////////////////////////////////////////////////////

    public String traverseRecursionInOrder()
    {
        display = new StringBuilder();
        inOrder(root);
        return display.toString();
    }

    private void inOrder(BinaryNode node)
    {
        if (node != null)
        {
            inOrder(node.getLeft());
            display.append(node.getData() + " ");
            inOrder(node.getRight());
        }
    }

    public String traverseIterativeInOrder()
    {
        if (root == null)
            return "";

        display = new StringBuilder();

        BinaryNode node = root;
        Stack<BinaryNode> stack = new Stack<BinaryNode>();

        while (!stack.empty() || node != null)
        {
            if (node != null)
            {
                stack.push(node);
                node = node.getLeft();
            }
            else
            {
                node = stack.pop();
                display.append(node.getData() + " ");
                node = node.getRight();
            }
        }

        return display.toString();
    }

    /////////////////////////////////////////////////////////////////////

    public String traverseRecursionPostOrder()
    {
        display = new StringBuilder();
        postOrder(root);
        return display.toString();
    }

    private void postOrder(BinaryNode node)
    {
        if (node != null)
        {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            display.append(node.getData() + " ");
        }
    }

    public String traverseIterativePostOrder()
    {
        if (root == null)
            return "";

        display = new StringBuilder();

        BinaryNode node = root;
        Stack<BinaryNode> stack = new Stack<BinaryNode>();

        while (true)
        {
            if (node != null)
            {
                if( node.getRight() != null)
                    stack.push(node.getRight());

                stack.push(node);
                node = node.getLeft();

                continue;
            }

            if(stack.isEmpty())
                return display.toString();

            node = stack.pop();

            if( node.getRight() != null && !stack.isEmpty() && node.getRight() == stack.peek())
            {
                stack.pop();
                stack.push(node);
                node = node.getRight();
            } else {
                display.append(node.getData() + " ");
                node = null;
            }
        }
    }

    ///////////////////////////////////////////////////////////////////

    public String traverseBreathFirst()
    {
        if (root == null)
            return "";

        display = new StringBuilder();

        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);

        while (!queue.isEmpty())
        {
            BinaryNode node = queue.remove();
            display.append(node.getData() + " ");

            if (node.getLeft() != null)
                queue.add(node.getLeft());

            if (node.getRight() != null)
                queue.add(node.getRight());
        }

        return display.toString();
    }
}
