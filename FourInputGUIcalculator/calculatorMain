import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Camilo
 */
public class CalculatorApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SwingUtilities.invokeLater(new Runnable(){
        public void run(){
        
        
          //creating the window
       
        JFrame Window = new JFrame("CalculatorMD");
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Building Window
        Window.add(new DoCalculation());
        
        //Window displayed
        Window.pack();
        Window.setVisible(true);
        
        }
    });
        
        
        
        
        
    }
}
