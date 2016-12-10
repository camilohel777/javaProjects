import java.util.Scanner;
/**
 *
 * @author Camilo
 */
public class asciiFunctions 
{
    
    int promptUser()
    {
        Scanner input = new Scanner(System.in);
        int c;
        do{
        System.out.println("Please enter the amount of columns you would like for the ASCII table print-out: Enter a number [1-8]\n");
        c = input.nextInt();
        }while( c < 1 || c > 8);
        
        return c;
    }
    
    private void printStrings(int decValue)
    {
        switch(decValue)
        {
            case 0:
                    System.out.printf("%5s\t","<NUL>");
                    break;
            case 1:
                    System.out.printf("%5s\t","<SOH>");
                    break;
            case 2:
                    System.out.printf("%5s\t","<STX>");
                    break;    
            case 3:
                    System.out.printf("%5s\t","<ETX>");
                    break;        
            case 4:
                    System.out.printf("%5s\t","<EOT>");
                    break;
            case 5:
                    System.out.printf("%5s\t","<ENQ>");
                    break;    
            case 6:
                    System.out.printf("%5s\t","<ACK>");
                    break;    
            case 7:
                    System.out.printf("%5s\t","<BEL>");
                    break;    
            case 8:
                    System.out.printf("%5s\t","<BS>");
                    break;
            case 9:
                    System.out.printf("%5s\t","<TAB>");
                    break;    
            case 10:
                    System.out.printf("%5s\t","<LF>");
                    break;    
            case 11:
                    System.out.printf("%5s\t","<VT>");
                    break;
            case 12:
                    System.out.printf("%5s\t","<FF>");
                    break;    
            case 13:
                    System.out.printf("%5s\t","<CR>");
                    break;    
            case 14:
                    System.out.printf("%5s\t","<SO>");
                    break;    
            case 15:
                    System.out.printf("%5s\t","<SI>");
                    break;    
            case 16:
                    System.out.printf("%5s\t","<DLE>");
                    break;    
            case 17:
                    System.out.printf("%5s\t","<DC1>");
                    break;    
            case 18:
                    System.out.printf("%5s\t","<DC2>");
                    break;    
            case 19:
                    System.out.printf("%5s\t","<DC3>");
                    break;    
            case 20:
                    System.out.printf("%5s\t","<DC4>");
                    break;   
            case 21:
                    System.out.printf("%5s\t","<NAK>");
                    break;    
            case 22:
                    System.out.printf("%5s\t","<SYN>");
                    break;    
            case 23:
                    System.out.printf("%5s\t","<ETB>");
                    break;    
            case 24:
                    System.out.printf("%5s\t","<CAN>");
                    break;    
            case 25:
                    System.out.printf("%5s\t","<EM>");
                    break;    
            case 26:
                    System.out.printf("%5s\t","<SUB>");
                    break;    
            case 27:
                    System.out.printf("%5s\t","<ESC>");
                    break;    
            case 28:
                    System.out.printf("%5s\t","<FS>");
                    break;    
            case 29:
                    System.out.printf("%5s\t","<GS>");
                    break;    
            case 30:
                    System.out.printf("%5s\t","<RS>");
                    break;    
            case 31:
                    System.out.printf("%5s\t","<US>");
                    break;    
            case 32:
                    System.out.printf("%5s\t","<SPC>");
                    break;        
            case 127:
                    System.out.printf("%5s\t","<DEL>");
                    break;    
                
        }
        
    }
    
    public void printASCII(int columns)
    {
        
        int total = 128;
        int index = 0;
        char values []= new char[total];
        
        for(;index < total; index++)
        {
            values[index] = (char)index;  //Assigns values to the array
        }
        
        
        //This piece of code checks if an ascii value is left over after columns are decided and appends it to a row to avoid extra column
        int i = 0;
        
        int rows = total/columns;
        
        if(total % columns != 0)
        {
            rows++;
        }
        
        //These 2 for loops will print out ASCII table from 0-127
        
        for(;i < rows;i++)
        {
            int j = i;
            
            for(;j < total; j = j+rows)
            {
                if(j < 33 || j ==127)
                {
                    System.out.printf("%3d ",j);
                    printStrings(j);
                    
                }
                else
                {
                    System.out.printf("%3d %5c\t",j,values[j]);
                }
            }
                   
            System.out.println();
        }
        
    }  
}
