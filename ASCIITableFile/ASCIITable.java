public class ASCIITable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int columns;
        
        asciiFunctions program = new asciiFunctions();
        
        columns = program.promptUser();
        program.printASCII(columns);
        
        
    }
    
}
