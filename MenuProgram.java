import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MenuProgram{
public MenuProgram(){
JFrame f=new JFrame("Simple Menu Program");
f.setSize(400,300);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JMenuBar m=new JMenuBar();
JMenu f1=new JMenu("Bangladeshi Cities");
JMenu f2=new JMenu("Bangladeshi Districts");
JMenuItem m1=new JMenuItem("Dhaka");
JMenuItem m2=new JMenuItem("Rajshahi");
JMenuItem m3=new JMenuItem("Sylhet");
JMenuItem m4=new JMenuItem("Barishal");
JMenuItem m5=new JMenuItem("Khulna");
JMenuItem m6=new JMenuItem("Jessore");
f1.add(m1);
f1.add(m2);
f1.add(m3);
f2.add(m4);
f2.add(m5);
f2.add(m6);
m1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	System.out.println("");
}
});
m2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	System.out.println("");
}
});
m3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	System.out.println("");
}
});
m4.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	System.out.println("");
}
});
m5.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	System.out.println("");
}
});
m6.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	System.out.println("");
}
});
m.add(f1);
m.add(f2);
f.setJMenuBar(m);
f.setVisible(true);
}
public static void main(String[] args){
SwingUtilities.invokeLater(new Runnable(){
public void run(){
new MenuProgram();
}
});
}
}