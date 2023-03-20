/* JTabbedPane constructors:

1. JTabbedPane();---->default

2. JTabbedPane(int tabpaneconst);
              (JTabbedPane.TOP);
                          .BOTTOM);
							 .LEFT);
							 .RIGHT);
here no required setBounds method

                  */

import javax.swing.*;
public class JTabbedPaneDemo
{
  JTabbedPaneDemo()
  {
    JTabbedPane jtp=new JTabbedPane();
    JFrame jf=new JFrame();
    JPanel p1=new JPanel();
    JPanel p2=new JPanel();
    JLabel l=new JLabel("Welcome");
    JTextField t=new JTextField("TabbedPane");
    jtp.add("TabPane1",p1);
    jtp.add("TabPane1",p2);
    p1.add(l);
    p2.add(t); 
    jf.add(jtp);
    jf.setSize(500,500);
    jf.setVisible(true);
    jf.setLayout(null);
   jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public static void main(String args[])
 {
   new JTabbedPaneDemo();
 }
}
   