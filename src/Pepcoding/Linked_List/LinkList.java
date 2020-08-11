package Pepcoding.Linked_List;

public class LinkList
{
    private class node
    {
        int data;
        node next;
    }
    private node head;
    private node tail;
    private node size;
    public void addLas(int data)
    {
        node n = new node();
        n.data = data;
        n.next = null;
        if(head == null)
        {
            head = n;
            tail = n;
        }
        else
        {
            tail.next = n;
            tail = n;
        }
    }
}
