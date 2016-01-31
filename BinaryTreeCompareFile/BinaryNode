public class BinaryNode {
    
    int element;
    BinaryNode left;
    BinaryNode right;
    
    //Creates(allocates) new node with data and NULL left and right pointers
    BinaryNode newNode(int data)
    {
        BinaryNode node = new BinaryNode(); 
        node.element = data;
        node.left = null;
        node.right = null;
        return node;
    }
    
    //Inserts new node into the binary tree
    BinaryNode insert(BinaryNode node, int data)
    {
        //1.If the tree is empty, return a new, single node
        if(node == null)
        {
            return (newNode(data));
        }
        else
        {
            //2.Otherwise, recur down the tree
            if(data <= node.element)
            {
                node.left = insert(node.left, data);
            }
            else
            {
                node.right = insert(node.right, data);
            }
            return node; //return the unchanged node pointer
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
    static boolean lookUp(BinaryNode node, int target)
    {
        //1. Base Case == empty tree
        //in that case, target is not found so return false
        
        if(node == null)
        {
            return false;
        }
        else
        {
            //Check if found in this node
            if(target == node.element)
            {
                return true;
            }
            else
            {
                if(target < node.element)
                {
                    return (lookUp(node.left, target));
                }
                else
                {
                    return (lookUp(node.right, target));
                }   
            }
        }  
    }
    
    //Calculates number of nodes in a tree
    int size(BinaryNode node)
    {
        if(node == null)
        {
            return 0;
        }
        else
        {
            return (size(node.left) + 1 + size(node.right));
        }
        
    }
    
    //Post-Order traversal and print
   public void printPostOrder(BinaryNode node)
    {
        if(node == null)
        {
            System.out.println("Empty node");
        }
        else
        {
              printTree(node.left);
              printTree(node.right);
              System.out.printf("%d", node.element);
        }
    }
   
   
    
}
