/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shellsort;

/**
 *
 * @author Camilo
 */
public class ShellSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
         int [] array={80,93,60,12,42,30,68,85,10};
        
        shellSort(array,array.length);
        
        System.out.println("\nSorted array:");
        for(int i = 0; i < array.length; i++)
           {
            System.out.print(array[i]);
            System.out.print(", ");
           }
        System.out.println();
    }
    
    public static void shellSort(int [] array, int n)
    {
        //This loops splits the array into small segments with n/2 gaps
        for(int gap = n/2; gap > 0; gap = gap/2)
        {
           for(int i = gap; i < n; i++)
           {
                int j = i;
                //Temp is the value to be compared within it's segment
                int temp = array[i];  
            //this loop performs comparisons then changes value
            for(; j >= gap && temp < array[j-gap]; j=j-gap)
            {
                
                array[j] = array[j - gap];
            }
            
            array[j]= temp;
           }
           
           //print loop
           System.out.println("\narray at loop:"+ gap);
           for(int i = 0; i < array.length; i++)
           {
            System.out.print(array[i]);
            System.out.print(", ");
           }
        }
    }
    
}
