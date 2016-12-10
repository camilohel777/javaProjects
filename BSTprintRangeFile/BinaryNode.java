//BINARY SEARCH TREE CLASS
public class BinaryNode {
    
    int element;
    BinaryNode left;
    BinaryNode right;
    
    //Creates a new node
    BinaryNode newNode(int data)
    {
        BinaryNode node = new BinaryNode();
        
        node.element = data;
        node.right = null;
        node.left = null;
        
        return node;
    }
    
    //Inserts recently created new node into tree
    BinaryNode insert(BinaryNode node, int data)
    {
        //If the tree is empty, return a new node
        if(node == null)
        {
            return (newNode(data));
        }
        else
        {
            if(data <= node.element)
            {
                node.left = insert(node.left, data);
            }
            else
            {
                node.right = insert(node.right, data);
            }
            return node;
        }
    }
    
    //Prints data elements in increasing sorted order
    void printTree(BinaryNode node)
    {
        if(node == null)
        {
            
        }
        else
        {
            printTree(node.left);
            System.out.printf("%d ", node.element);
            printTree(node.right);
        }
    }
    
    //Find a specific element in the tree. Return true if found, false if not
    static boolean lookup(BinaryNode node, int target)
    {
        //If tree is empty
        if(node == null)
        {
            return false;
        }
        else
        {
            if(target == node.element)
            {
                return true;
            }
            else
            {
                if(target < node.element)
                {
                    return lookup(node.left, target);
                }
                else
                {
                    return lookup(node.right, target);
                }
            }
        }
    }
    
    //Calculates size of the tree
    int size(BinaryNode node)
    {
        if(node == null)
        {
            return 0;
        }
        else
        {
            return size(node.left) + 1 + size(node.right);
        }
    }   
    
}
