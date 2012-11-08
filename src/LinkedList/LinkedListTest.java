package LinkedList;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Mike
 * Date: 11/7/12
 * Time: 9:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class LinkedListTest {


    @Test
    public void testInsert()
    {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        assertEquals("1 2 3 ", list.printList());
    }

    @Test
    public void testDeleteHead()
    {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.delete(1);

        assertEquals("2 3 ", list.printList());
    }

    @Test
    public void testDeleteTail()
    {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.delete(3);
        assertEquals("1 2 ", list.printList());
    }

    @Test
    public void testDeleteMiddle()
    {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.delete(2);
        assertEquals("1 3 ", list.printList());
    }
}
