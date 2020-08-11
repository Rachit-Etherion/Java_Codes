package Data_Structures.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryTree
{
    node root;

    BinaryTree()
    {
        root = null;
    }

    public void insert(int data)
    {
        root = addrecursive(root,data);
    }

    private node addrecursive(node current, int data)
    {
        if(current == null)
        {
            return new node(data);
        }
        if(data < current.getData())
        {
            current.left = addrecursive(current.left,data);
        }
        else if (data > current.getData())
        {
            current.right = addrecursive(current.right, data);
        }
        else
            {
            return current;
            }

        return current;
    }

    public void traverseInOrder(node n)
    {
        if(n != null)
        {
            traverseInOrder(n.left);
            System.out.print(n.getData() + " ");
            traverseInOrder(n.right);
        }
    }

    public void traversePreOrder(node n)
    {
        if(n != null)
        {
            System.out.print(n.getData() + " ");
            traversePreOrder(n.left);
            traversePreOrder(n.right);
        }
    }

    public void traversePostOrder(node n)
    {
        if(n != null)
        {
            traversePostOrder(n.left);
            traversePostOrder(n.right);
            System.out.print(n.getData() + " ");
        }
    }

    public static void main(String []args)
            throws IOException
    {
        BinaryTree tree = new BinaryTree();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice;
        do
        {
            System.out.println("Enter your Choice");
            System.out.println("1- Insert node ");
            System.out.println("2- Print InOrder");
            System.out.println("3- Print PreOrder");
            System.out.println("0- exit");
            choice = Integer.parseInt(br.readLine());
            switch(choice)
            {
                case 1:
                    System.out.println("Enter Data to be add : ");
                    tree.insert(Integer.parseInt(br.readLine()));
                    break;
                case 2:
                    tree.traverseInOrder(tree.root);
                    System.out.println();
                    break;
                case 3:
                    tree.traversePreOrder(tree.root);
                    System.out.println();
                    break;
                case 4:
                    tree.traversePostOrder(tree.root);
                    System.out.println();
                    break;
            }

        }while(choice != 0);
    }
}
