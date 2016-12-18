/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package notrecursivebinarysearch;

import java.util.Scanner;

public class NotRecursiveBinarySearch {

     static int NOT_FOUND = -1;
     
    public static void main(String[] args) {
       
        int array [] = {1,2,3,4,5,6,7,8,9,10,     //0-9
          11,12,13,14,15,16,17,18,19,20             //10-19
          ,29,30,34,45,46,54,67,78,89,90};          //20-29
        
        int x;
        String selection;
        Scanner input = new Scanner(System.in);
        boolean stop = false;
        
        do{
        
        System.out.println("Please Enter the number you want to find in a list of numbers from the array:");
        x = input.nextInt();
        System.out.println(binarySearch(array, x));
        
        System.out.println("Press yes to do another search or no to exit.");
        selection = input.next();
        
        if("yes".equals(selection))
        {
            stop = false;
        }
        else if("no".equals(selection))
        {
            stop = true;
        }
        else
        {
            System.out.println("Invalid input. Program will end");
            stop = true;
        }
        
        }while(stop == false);
        
    }
    
    public static int binarySearch(int [] a , int x)
    {
        int low = 0;
        int high = a.length - 1;
        
        while(low <= high)
        {
            int mid = (low + high)/2;
            
            if(a[mid] == x)              
                return mid;              //found
            
       else if(a[mid] < x)               // a < x
                low = mid + 1;
       
       else                             // a > x
                high = mid - 1;  
        }
        
        return NOT_FOUND; //NOT_FOUND is defined as -1
        
       
    }
}
