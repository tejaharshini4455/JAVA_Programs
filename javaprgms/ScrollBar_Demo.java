import javax.swing.*;  
import java.awt.event.*;  
class ScrollBar_Demo  
{  
 ScrollBar_Demo()
 {  
  JFrame f= new JFrame("Scrollbar Example");  
  final JLabel label = new JLabel();          
  label.setHorizontalAlignment(JLabel.CENTER);    
  label.setSize(400,100);  
  final JScrollBar s=new JScrollBar();  
  s.setBounds(100,100, 50,100);  
  f.add(s); f.add(label);  
  f.setSize(400,400);  
  f.setLayout(null);  
  f.setVisible(true);  
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  s.addAdjustmentListener(new AdjustmentListener()
  {  
   public void adjustmentValueChanged(AdjustmentEvent e)
   {  
    label.setText("Vertical Scrollbar value is:"+ s.getValue());  
   }  
  });  
 }  
 public static void main(String args[])  
 {  
  new ScrollBar_Demo();  
 }
}  