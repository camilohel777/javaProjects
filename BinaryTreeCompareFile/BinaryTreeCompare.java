import static binarytreecompare.BinaryNode.lookUp;



/**
 *
 * @author Camilo
 */
public class BinaryTreeCompare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        BinaryNode treeOne = new BinaryNode();
        BinaryNode treeTwo = new BinaryNode();
        
               
        treeOne.insert(treeOne, 4);
        treeOne.insert(treeOne, 2);
        treeOne.insert(treeOne, 1);
        treeOne.insert(treeOne, 3);
        treeOne.insert(treeOne, 5);
        
        
        treeTwo.insert(treeTwo, 1);
        treeTwo.insert(treeTwo, 2);
        treeTwo.insert(treeTwo, 3);
        treeTwo.insert(treeTwo, 4);
        treeTwo.insert(treeTwo, 5);
        
        
        System.out.println("The elements of the TreeOne printed in Post-Order notation: ");
        treeOne.printPostOrder(treeOne);
        System.out.println("\nThe elements of TreeTwo printed in Post-Order notation: ");
        treeTwo.printPostOrder(treeTwo);
        System.out.println("\nBoth of the trees are similar: ");
        //Testing both trees for similarity
        System.out.println(similar(treeOne, treeTwo));
        
        
        //Added a new element to treeTwo to now test again for difference which should print out false
        treeTwo.insert(treeTwo, 6);
        
        System.out.println("\nThe elements of the TreeOne printed in Post-Order notation: ");
        treeOne.printPostOrder(treeOne);
        System.out.println("\nThe elements of TreeTwo printed in Post-Order notation: ");
        treeTwo.printPostOrder(treeTwo);
        //Testing again
        System.out.println("\nBoth of the trees are similar: ");
        System.out.println(similar(treeOne, treeTwo)); 
        
        System.out.println(lookUp(treeTwo, 4));
    }
    
    //Compare the two trees and return true if they are similar or false if they are different
    static boolean similar(BinaryNode t1, BinaryNode t2)
    {
        
      //If both are empty then it is true.
      if (t1 == null && t2 == null) 
      {
          return true;
      }
      //If both are not empty then compare the values in the nodes
      else if (t1 != null && t2 != null) 
      { 
        return t1.element == t2.element && similar(t1.left, t2.left) && similar(t1.right, t2.right); 
      } 
    //If one is empty and one is not, or if different values then return false
      else
      {
          return false;  
      }
      
    }
}   
