import javax.swing.*;  
import java.awt.event.*;    
public class CheckBox_Demo1    
{    
 CheckBox_Demo1()
 {    
  JFrame f= new JFrame("CheckBox Example");    
  final JLabel l = new JLabel();            
  l.setHorizontalAlignment(JLabel.CENTER);    
  l.setSize(400,100);    
  JCheckBox cb1 = new JCheckBox("Java Programming");    
  cb1.setBounds(150,100, 150,50);    
  JCheckBox cb2 = new JCheckBox("Advanced Java");    
  cb2.setBounds(150,150, 150,50);    
  f.add(cb1); f.add(cb2); f.add(l);    
  cb1.addItemListener(new ItemListener()
  {    
   public void itemStateChanged(ItemEvent e)
   {                 
    l.setText("Java Programming Checkbox: "     
      + (e.getStateChange()==1?"checked":"unchecked"));    
   }    
  });    
  cb2.addItemListener(new ItemListener()
  {    
   public void itemStateChanged(ItemEvent e)
   {                 
    l.setText("Advanced Java Checkbox: "     
      + (e.getStateChange()==1?"checked":"unchecked"));    
   }    
  });    
  f.setSize(400,400);    
  f.setLayout(null);    
  f.setVisible(true);    
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }    
 public static void main(String args[])    
 {    
   new CheckBox_Demo1();    
 }    
}    