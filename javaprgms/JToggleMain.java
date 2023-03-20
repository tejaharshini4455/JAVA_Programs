import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.JLabel;

public class JToggleMain 
{
  public static void main(String args[]) 
  {
    JFrame frame = new JFrame("Selecting Toggle");
    
    JToggleButton tb = new JToggleButton("Toggle Button");
        
    Font f=new Font("Serif",3,30);
     JLabel l=new JLabel("JTOggle Example");
      l.setFont(f);
      frame.add(l);
      
    // Define ActionListener
   
      ActionListener actionListener = new ActionListener() 
      {
         public void actionPerformed(ActionEvent actionEvent)
         {
           AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
           boolean selected = abstractButton.getModel().isSelected();
           System.out.println("Action - selected=" + selected + "\n");
           if(selected==true)                     
             l.setText("Button on");           
           else
             l.setText("Button off");
           
         }
      };
    // Attach Listeners
    
    tb.addActionListener(actionListener);
    frame.add(tb,BorderLayout.NORTH);
    frame.setSize(500,500);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}