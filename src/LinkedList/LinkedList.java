package LinkedList;


public class LinkedList {

    private Node head = null;

    public LinkedList()
    {

    }

    public boolean isEmpty()
    {
        return head == null;
    }

    public void insert(int data)
    {
        Node node = new Node(data);

        if (head == null) {
            head = node;
            return;
        }

        Node current = head;
        while (current.getNext() != null)
        {
            current = current.getNext();
        }

        node.setPrevious(current);
        current.setNext(node);
    }

    public boolean delete(int data)
    {
        Node current = head;

        while (current != null && current.getData() != data)
        {
            current = current.getNext();
        }

        if (current == null)
            return false;

        if (current == head){
            head = current.getNext();
            head.setPrevious(null);
        }
        else if (current.getNext() == null)
        {
            current.getPrevious().setNext(null);
        }
        else
        {
            current.getPrevious().setNext(current.getNext());
            current.getNext().setPrevious(current.getPrevious());
        }
        return true;
    }

    public String printList()
    {
        Node current = head;
        String listString = "";

        while(current != null)
        {
            listString += current.getData() + " ";
            current = current.getNext();
        }

        return listString;
    }
}
