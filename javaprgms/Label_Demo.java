import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
public class Label_Demo extends JFrame implements ActionListener
{  
 JTextField tf; JLabel l,l1; JButton b;  
 Label_Demo()
 {  
  tf=new JTextField();  
  tf.setBounds(50,50, 150,20);  
  l=new JLabel();  
  l.setBounds(50,100, 250,20); 
  l1=new JLabel(new ImageIcon("god.jpg"));
  l1.setBounds(80,80,100,100);     
  b=new JButton("Find IP");  
  b.setBounds(50,150,95,30);  
  b.addActionListener(this);    
  add(b);add(tf);add(l);add(l1);    
  setSize(400,400);  
  setLayout(null);  
  setVisible(true);  
  setDefaultCloseOperation(EXIT_ON_CLOSE);  
 }  
 public void actionPerformed(ActionEvent e)
 {  
  try
  {  
   String host=tf.getText();  
   String ip=java.net.InetAddress.getByName(host).getHostAddress();  
   l.setText("IP of "+host+" is: "+ip);  
  }catch(Exception ex)
   {
    System.out.println(ex);
   }  
 }  
 public static void main(String[] args)
 {  
   new Label_Demo();  
 } 
}  