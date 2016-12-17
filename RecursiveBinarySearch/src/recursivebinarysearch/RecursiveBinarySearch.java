/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursivebinarysearch;

import java.util.Scanner;

/**
 *
 * @author Camilo
 */
public class RecursiveBinarySearch {

    public static void main(String[] args) {
        
          int array [] = {1,2,3,4,5,6,7,8,9,10,     //0-9
          11,12,13,14,15,16,17,18,19,20             //10-19
          ,29,30,34,45,46,54,67,78,89,90};          //20-29
        
        BinarySearchRecursive binSearch = new BinarySearchRecursive();
        int x;
        String selection;
        Scanner input = new Scanner(System.in);
        boolean stop = false;
        
        do{
        System.out.println("Please Enter the number you want to find in a list of numbers from the array:");
        x = input.nextInt();
        System.out.println(binSearch.binarySearch(array, x));
        
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
    
    
    
}
