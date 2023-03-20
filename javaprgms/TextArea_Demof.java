import java.awt.*;  
import java.awt.event.*;  
public class TextArea_Demof extends Frame implements ActionListener
{  
 Label l1,l2;  
 TextArea ta;  
 Button b;  
 TextArea_Demof()
 {  
  Frame f= new Frame();  
  l1=new Label();  
  l1.setBounds(50,25,100,30);  
  l2=new Label();  
  l2.setBounds(160,25,100,30);  
  ta=new TextArea();  
  ta.setBounds(20,75,250,200);  
  b=new Button("Count Words");  
  b.setBounds(100,300,120,30);  
  b.addActionListener(this);  
  add(l1);add(l2);add(ta);add(b);  
  setSize(450,450);  
  setLayout(null);  
  setVisible(true);  
  //f.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);  
 }  
 public void actionPerformed(ActionEvent e)
 {  
  String text=ta.getText();  
  String words[]=text.split("\\s");  
  l1.setText("Words: "+words.length);  
  l2.setText("Characters: "+text.length());  
 }  
 public static void main(String[] args)
 {  
   new TextArea_Demof();  
 }
}  