package Data_Structures.tree;

public class node
{
    private int data;
    node left, right;

    public int getData()
    {
        return data;
    }

    public void setData(int data)
    {
        this.data = data;
    }

    public node(int data)
    {
        this.data = data;
        left = right = null;
    }
}
