//JSpinner Example with ChangeListener    
import javax.swing.*;    
    import javax.swing.event.*;  
    public class Spinner_Demo {  
        public static void main(String[] args) {    
        JFrame f=new JFrame("Spinner Example");    
        final JLabel label = new JLabel();            
                 label.setHorizontalAlignment(JLabel.CENTER);    
                 label.setSize(250,100);    
        SpinnerModel value =  
                 new SpinnerNumberModel(5, //initial value  
                    0, //minimum value  
                    10, //maximum value  
                    1); //step  
        JSpinner spinner = new JSpinner(value);   
                spinner.setBounds(100,100,50,30);    
                f.add(spinner);  f.add(label);  
               f.setSize(300,300);    
               f.setLayout(null);    
               f.setVisible(true);    
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
               spinner.addChangeListener(new ChangeListener() {  
            public void stateChanged(ChangeEvent e) {  
             label.setText("Value : " + ((JSpinner)e.getSource()).getValue());  
            }  
         });  
    }  
    }  