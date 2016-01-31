public class BSTprintRange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        BinaryNode BST = new BinaryNode();
        
        BST.insert(BST, 1);
        BST.insert(BST, 9);
        BST.insert(BST, 8);
        BST.insert(BST, 7);
        BST.insert(BST, 6);
        BST.insert(BST, 5);
        BST.insert(BST, 4);
        BST.insert(BST, 3);
        BST.insert(BST, 2);
        BST.insert(BST, 10);
        
        System.out.println("Printing entire tree:");
        BST.printTree(BST);
        System.out.println("\n");
     
        //lower K1 = 4 and upper K2 = 8
        System.out.println("Printing selected range [4 to 8] of the tree:");
        printRange(4,8,BST);
        
        
       
        System.out.println("\nPrinting selected range [2 to 9] of the tree:");
        printRange(2,9,BST);
        System.out.println("\n");
   
    }
    //Prints elements X when K1 <= X <= K2
    static void printRange(int lower,int upper,BinaryNode t)
    {
        if(t == null)
        {
            return;
        }
        else
        {
            printRange(lower, upper, t.left);
            if(t.element >= lower && t.element <= upper )
            {
                System.out.printf("%d ", t.element);
            }
            printRange(lower, upper, t.right); 

        }
    }   
}
