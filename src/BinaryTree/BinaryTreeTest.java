package BinaryTree;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class BinaryTreeTest {


    @Test
    public void emptyTest()
    {
        BinaryTree tree = new BinaryTree();
        assertEquals("", tree.traverseRecursionPreOrder());
    }

    @Test
    public void insertRootTest()
    {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        assertEquals("5 ", tree.traverseRecursionPreOrder());
    }

    @Test
    public void smallTreeTest()
    {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(7);

        assertEquals("5 2 7 ", tree.traverseRecursionPreOrder());
        assertEquals("2 5 7 ", tree.traverseRecursionInOrder());
        assertEquals("2 7 5 ", tree.traverseRecursionPostOrder());

        assertEquals("5 2 7 ", tree.traverseIterativePreOrder());
        assertEquals("2 5 7 ", tree.traverseIterativeInOrder());
        assertEquals("2 7 5 ", tree.traverseIterativePostOrder());

        tree.insert(3);
        tree.insert(6);

        assertEquals("5 2 3 7 6 ", tree.traverseIterativePreOrder());
        assertEquals("2 3 5 6 7 ", tree.traverseIterativeInOrder());
        assertEquals("3 2 6 7 5 ", tree.traverseIterativePostOrder());

        assertEquals("5 2 3 7 6 ", tree.traverseIterativePreOrder());
        assertEquals("2 3 5 6 7 ", tree.traverseIterativeInOrder());
        assertEquals("3 2 6 7 5 ", tree.traverseIterativePostOrder());
    }

    @Test
    public void breathFirstSearchTest()
    {
        BinaryTree tree = setUpTree();

        assertEquals("5 2 7 3 6 ", tree.traverseBreathFirst());
    }

    private BinaryTree setUpTree()
    {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(7);
        tree.insert(3);
        tree.insert(6);

        return tree;
    }

    @Test
    public void deleteTest()
    {
        BinaryTree tree = setUpTree();
        tree.delete(5);
        assertEquals("3 2 7 6 ", tree.traverseIterativePreOrder());
    }
}
