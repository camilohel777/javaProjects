import java.awt.*;
import java.awt.event.*;
 
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;
 
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
 
import java.text.*;

public class DoCalculation extends JPanel implements PropertyChangeListener{
    
    //value for the fields
    private double num1;
    private double num2;
    private double num3;
    private double num4;
    
    //label to identify fields
    private static JLabel num1label;
    private static JLabel num2label;
    private static JLabel num3label;
    private static JLabel num4label;
    private static JLabel sumlabel;
    
    //Strings for labels
    private static String num1string = "A: ";
    private static String num2string = "B: ";
    private static String num3string = "C: ";
    private static String num4string = "D: ";
    private static String sumstring = "Result: ";
    
    //Fields for data entry
    private JFormattedTextField num1Field;
    private JFormattedTextField num2Field;
    private JFormattedTextField num3Field;
    private JFormattedTextField num4Field;
    private JFormattedTextField sumField;
    
    //Formats to format and parse numbers
    private NumberFormat variableFormat;
    private NumberFormat sumFormat;
    
    //Constructor
    public DoCalculation(){
        
    super(new BorderLayout());
   
    double sum = calculateTotal(num1, num2, num3, num4);
    
    //create labels
    num1label = new JLabel(num1string);
    num2label = new JLabel(num2string);
    num3label = new JLabel(num3string);
    num4label = new JLabel(num4string);
    sumlabel = new JLabel(sumstring);
    
    //create the text fields and set them up
     num1Field = new JFormattedTextField(variableFormat);
     num1Field.setValue(new Double(num1));
     num1Field.setColumns(10);
     num1Field.addPropertyChangeListener("value", this);
     
     num2Field= new JFormattedTextField(variableFormat);
     num2Field.setValue(new Double(num2));
     num2Field.setColumns(5);
     num2Field.addPropertyChangeListener("value", this);
     
     num3Field= new JFormattedTextField(variableFormat);
     num3Field.setValue(new Double(num3));
     num3Field.setColumns(5);
     num3Field.addPropertyChangeListener("value", this);
     
     num4Field= new JFormattedTextField(variableFormat);
     num4Field.setValue(new Double(num4));
     num4Field.setColumns(5);
     num4Field.addPropertyChangeListener("value", this);
     
     sumField= new JFormattedTextField(sumFormat);
     sumField.setValue(new Double(sum));
     sumField.setColumns(5);
     sumField.setEditable(false);
     sumField.addPropertyChangeListener("value", this);
     
     //Tell accessibility tools for label and textfield pairs
    num1label.setLabelFor(num1Field);
    num2label.setLabelFor(num2Field);
    num3label.setLabelFor(num3Field);
    num4label.setLabelFor(num4Field);
    sumlabel.setLabelFor(sumField);
    
    //Text field panel
    JPanel fpanel = new JPanel(new GridLayout(0,1));
    
    fpanel.add(num1Field);
    fpanel.add(num2Field);
    fpanel.add(num3Field);
    fpanel.add(num4Field);
    fpanel.add(sumField);
    
    //label layout in panel
    JPanel lpanel = new JPanel(new GridLayout(0,1));
    
    lpanel.add(num1label);
    lpanel.add(num2label);
    lpanel.add(num3label);
    lpanel.add(num4label);
    lpanel.add(sumlabel);
    
    // Placing panels on the panel with labels to the left and text on the right
    setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
    add(lpanel, BorderLayout.CENTER);
    add(fpanel, BorderLayout.LINE_END);
}
    
    public void propertyChange(PropertyChangeEvent e)
    {
        Object source = e.getSource();
        if(source == num1Field)
            num1 = ((Number)num1Field.getValue()).doubleValue();
        else if(source == num2Field)
            num2 = ((Number)num2Field.getValue()).doubleValue();
        else if(source == num3Field)
            num3 = ((Number)num3Field.getValue()).doubleValue();
        else if(source == num4Field)
            num4 = ((Number)num4Field.getValue()).doubleValue();
        
        double sum = calculateTotal(num1, num2, num3, num4);
        sumField.setValue(new Double(sum));
        
    }
    
    
    

    
    private double calculateTotal(double a, double b, double c, double d){
        
        double sum = a * Math.pow(b , 2) - Math.pow(c, 2) * d;
        return sum;
        
    }
    
}
