public class SubLinearExp {

    static long counter = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println(exponentiation(3,63));
        System.out.println("Total amount of multiplications performed = "+ counter);
    }
    
    
     public static long exponentiation(long x, int n)
    {
        counter++;
        
        if( n == 0)
        { //Finished exponent
            return 1;
        }
        else if(n % 2 == 0)
        { 
            //if n is even
            counter++;
            return exponentiation(x * x, n/2);
        }
        else     
        {
            //If n is odd
            counter++;
            return x * exponentiation(x * x, (n-1)/2);
        }
        
        
    }
    
}
