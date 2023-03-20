import javax.swing.*;    
import java.awt.event.*;  
public class PasswordField_Demo
{  
 public static void main(String[] args)
 {    
  JFrame f=new JFrame("Password Field Example");    
  final JLabel l = new JLabel();            
  l.setBounds(20,150, 200,50);  
  final JPasswordField jpf = new JPasswordField();   
  jpf.setBounds(100,75,100,30);   
  JLabel l1=new JLabel("Username:");    
  l1.setBounds(20,20, 80,30);    
  JLabel l2=new JLabel("Password:");    
  l2.setBounds(20,75, 80,30);    
  JButton b = new JButton("Login");  
  b.setBounds(100,120, 80,30);    
  final JTextField tf = new JTextField();  
  tf.setBounds(100,20, 100,30);    
  f.add(jpf); f.add(l1); f.add(l); f.add(l2); f.add(b); f.add(tf);  
  f.setSize(300,300);    
  f.setLayout(null);    
  f.setVisible(true);     
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  b.addActionListener(new ActionListener()
  {  
   public void actionPerformed(ActionEvent e)
   {       
    String data = "Username " + tf.getText();  
    data += ", Password: " + new String(jpf.getPassword());   
    l.setText(data);          
   }  
  });   
 }  
}  