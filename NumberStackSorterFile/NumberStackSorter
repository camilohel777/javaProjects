import java.util.Stack;
/**
 *
 * @author Camilo
 */
public class NumberStackSorter
{
    
    public static void main(String[] args)
    {
        System.out.println("\t\tBottom ------------>Top");
        System.out.println("Unsorted stack: " + createStack());
        System.out.println("Sorted stack: " + sort(createStack()));

    }
    
   //creates and initiates an original stack
    public static Stack<Integer> createStack()
    {
        
        Stack<Integer> numStack = new Stack();
        //Inserted random numbers with which to test the sort.
        numStack.push(21);
        numStack.push(7);
        numStack.push(13);
        numStack.push(3);
        numStack.push(5);
        numStack.push(8);
        numStack.push(8);
        numStack.push(6);
        numStack.push(50);
        numStack.push(34);
        
        return numStack;
    }

    public static Stack<Integer> sort(Stack<Integer> oStack) //Run-time complexity of this sort is O(N^2)
    {
   
    Stack<Integer> newStack = new Stack();
    int temp1 = 0;

    while(!oStack.isEmpty())
    {
        temp1 = oStack.pop(); //Pop the top element from the original stack

        //Store temp into newStack where it should be. newStack will be a descending stack.
        while(!newStack.isEmpty() && temp1 > newStack.peek())
        {
            //Pop elements that are smaller than temp and put them back into original stack
            oStack.push(newStack.pop()); 
        }

        //push in temp into the new stack
        newStack.push(temp1);
        
    }
    //Pop all the elements that were in descending order in the new stack and place them in ascending order back in the old stack
    while(!newStack.isEmpty())
    {
        oStack.push(newStack.pop());
    }

    return oStack; //return sorted original Stack
    }
}
