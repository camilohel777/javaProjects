/******************************************************* 
 * Program Number: A2_< problem #3 > 
 * Purpose/Description: 
 * < This program checks for the balance of the parenthesis in a string by converting the string to a character array and then
 * putting it in a stack. It returns true if the symbols are balanced and false if they are not.> 
 * Author: <Camilo Rivera> 
 * Due date: <06/10/15> 
 * Certification: I hereby certify that this work is my own and none of it is the work of any other person. 
 * < Camilo Enrique Rivera > 
 *******************************************************/

package balancedparenthesis;

import java.util.Stack;

/**
 *
 * @author Camilo
 */
public class BalancedParenthesis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Stack<String> balanceStack = new Stack();
      String string1 = "[()]{}[{[()()]()}]";
      String string2 = "{[(])}";
      
                 
      isBalanced(separator(string1)); //Testing string 1
      isBalanced(separator(string2)); //Testing string 2
     
    }
     //Separates String into seperate tokens and puts into character array
    public static char [] separator(String theString)
    {      
        //Split option
        char [] tokens = theString.toCharArray();
               
        return tokens;
    }
    
    public static boolean isBalanced(char [] symArray)
    {
        Stack <Character> balanceStack = new Stack();
        
        for(int i = 0; i < symArray.length; i++)
        {
            char symbol = symArray[i];
            switch(symbol)
            {
                case '(':
                case '{':
                case '[':
                    balanceStack.push(symbol);
                    break;
                    
                case ')':
                    if(balanceStack.isEmpty() || balanceStack.pop() != '(')
                    {
                        System.out.println("False");
                        return false;
                        
                    }
                    break;
                
                case '}':
                    if(balanceStack.isEmpty() || balanceStack.pop() != '{')
                    {
                        System.out.println("False");
                        return false;
                    }
                    break;
                
                case ']':
                    if(balanceStack.isEmpty() || balanceStack.pop() != '[')
                    {
                        System.out.println("False");
                        return false;
                    }
                    break;
            }
        }
        
        if(balanceStack.isEmpty()) //Nothing in stack meaning it's balanced
        {
            System.out.println("True");
            return true;
        }
        else //Error
        {
            return false;
        } 
    }  
}
