/* Jtree class constructors:
1. JTree();
2. JTree(Arry items[]);
3. JTree(root r)--->root node address

method:
add();  */

import javax.swing.*;
import javax.swing.tree.*;
public class JTreeDemo
{
  JTreeDemo()
  {
    JFrame jf=new JFrame();
    DefaultMutableTreeNode f=new DefaultMutableTreeNode("Font");
    DefaultMutableTreeNode s=new DefaultMutableTreeNode("Style");
    DefaultMutableTreeNode c=new DefaultMutableTreeNode("Color");
    f.add(s);
    f.add(c); 
    DefaultMutableTreeNode c1=new DefaultMutableTreeNode("Red");
    DefaultMutableTreeNode c2=new DefaultMutableTreeNode("Blue");
    DefaultMutableTreeNode c3=new DefaultMutableTreeNode("Green");
    c.add(c1);
    c.add(c2);
    c.add(c3);
    DefaultMutableTreeNode s1=new DefaultMutableTreeNode("Times New Roman");
    DefaultMutableTreeNode s2=new DefaultMutableTreeNode("Serif");
    s.add(s1);
    s.add(s2);
    JTree jt=new JTree(f);
    jf.add(jt);
    jf.setSize(400,400);
   // jf.setLayout(null);
    jf.setVisible(true);
   jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
 public static void main(String args[])
 {
   new JTreeDemo();
 }
}

    