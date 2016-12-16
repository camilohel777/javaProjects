/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package insertionsort;

/**
 *
 * @author Camilo
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int [] array={2,4,1,10,7,8,5,3,9,6};
        
        insertionSort(array);
        
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
        
        
        
        
    }
    //Insertion sort: Best case is O(n) and worst/average is O(n^2)
    
    public static void insertionSort(int [] a)
    {
        
        for(int p = 1; p < a.length; p++)
        {
            int j;
            int temp = a[p];
            for(j = p; j > 0 && temp < a[j-1]; j--)
            {
                //If value being scanner by main loop is lesser than previous number,
                //then in the test value's position insert the number that is greater and 
                a[j]= a[j-1];
                
            }
            //a[j-1] = temp because of the decrementer in the nest loop
            a[j] = temp;
        }
        
    }
    
}
