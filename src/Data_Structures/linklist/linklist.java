package Data_Structures.linklist;

public class linklist
{
    NodeTest head;

    void print()
    {
        NodeTest temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String []args)
    {
        linklist llist = new linklist();
        llist.addlast(1);
        llist.addlast(2);
        llist.addlast(4);
        llist.addafter(3,2);
        llist.print();
    }

    void addfirst(int data)
    {
        NodeTest node = new NodeTest(data);
        node.next = head;
        head = node;
    }

    void addlast(int data)
    {
        NodeTest node = new NodeTest(data);
        NodeTest temp = head;
        if (temp == null)
        {
            head = node;
        }
        else
        {
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    void addafter(int data,int search)
    {
        NodeTest node = new NodeTest(data);
        NodeTest temp = head;
        while (temp != null)
        {
            if(temp.data == search)
            {
                NodeTest join = temp.next;
                temp.next = node;
                node.next = join;
                return;
            }
            temp = temp.next;
        }
        System.out.println("data not exist to enter element");
    }
}
