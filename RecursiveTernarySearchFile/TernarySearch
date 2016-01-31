public class TernarySearchRecursive 
{
    public int terSearch(int [] a, int x)
    {
        return terSearch(a, x, 0, a.length - 1);
    }
    
    private int terSearch(int []a, int x, int left, int right)
    {
   
    if(left > right)
    {
         return -1;
    }   
      
  else{ 
          int d1 = left + (right - left)/3;
          int d2 = d1 + (right - left)/3;
          
          if(a[d1] == x)
          {
              return d1;
          }
          else if(a[d2] == x)
          {
              return d2;
          }
          else if(a[d1] < x && a[d2] > x)
          {
              return terSearch(a, x, d1+1, d2);
          }
          else if(a[d1] > x)
          {
            return terSearch(a, x, left, d1 - 1);
          }
          else // a[d2] < x 
          {
              return terSearch(a, x, d2+1, right);
          }
      } 
  }
}
