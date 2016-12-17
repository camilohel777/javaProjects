/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursivebinarysearch;

/**
 *
 * @author Camilo
 */

public class BinarySearchRecursive {
    final int NOT_FOUND = -1;
    public int binarySearch(int [] a, int x)
    {
        return binarySearch(a, x, 0, a.length - 1);
    }
    
    private int binarySearch(int []a, int x, int low, int high)
    {
   
    if(low > high)
    {
         return NOT_FOUND;
    }   
      
    else{ 
          int mid = (high + low)/2;
          if(a[mid] == x)
          {
              return mid;
          }
          else if(a[mid] < x)
          {
              return binarySearch(a, x, mid+1, high);
          }
          else // a[mid] > x
          {
            return binarySearch(a, x, low, mid - 1);
          }
        } 
   }
    
}
