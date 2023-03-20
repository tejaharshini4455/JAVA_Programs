import javax.swing.*;  
import java.awt.event.*;  
public class List_Demo  
{  
 List_Demo()
 {  
  JFrame f= new JFrame();  
  final JLabel label = new JLabel();          
  label.setSize(500,100);  
  JButton b=new JButton("Show");  
  b.setBounds(200,150,80,30);  
  final DefaultListModel<String> l1 = new DefaultListModel<>();  
  l1.addElement("DM");  
  l1.addElement("OS");  
  l1.addElement("JP");  
  l1.addElement("SE");  
  final JList<String> list1 = new JList<>(l1);  
  list1.setBounds(100,100, 75,75);  
  DefaultListModel<String> l2 = new DefaultListModel<>();  
  l2.addElement("AdvJava");  
  l2.addElement("Python");  
  l2.addElement("CO");  
  l2.addElement("OOAD");  
  final JList<String> list2 = new JList<>(l2);  
  list2.setBounds(100,200, 75,75);  
  f.add(list1); f.add(list2); f.add(b); f.add(label);  
  f.setSize(450,450);  
  f.setLayout(null);  
  f.setVisible(true);  
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  b.addActionListener(new ActionListener()
  {  
   public void actionPerformed(ActionEvent e)
   {   
    String data = "";  
    if (list1.getSelectedIndex() != -1)
    {                       
     data = "I Semester Selected: " + list1.getSelectedValue();   
     label.setText(data);  
    }  
    if(list2.getSelectedIndex() != -1)
    {  
     data += ", II Semester Selected: ";  
     for(Object frame :list2.getSelectedValues())
     {  
      data += frame + " ";  
     }  
    }  
    label.setText(data);  
   }  
  });   
 }  
 public static void main(String args[])  
 {  
  new List_Demo();  
 }
}  