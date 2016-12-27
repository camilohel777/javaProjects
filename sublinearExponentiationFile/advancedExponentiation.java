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
        
        if( n == 0)
        { //Finished exponent
            return 1;
        }
        else
        {
            counter+=1;
            long half = exponentiation(x, n/2);
            
            if(n % 2 == 0)
            { 
                //if n is even
                return half * half;
            }
            else     
            {
                //If n is odd
                return x * half * half;
            }
        }          
    }
    
}
