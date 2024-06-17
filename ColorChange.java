import java.awt.*;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ColorChange{
private JFrame f;
public ColorChange(){
f=new JFrame("Click a Button");
f.setSize(400,300);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JPanel p=new JPanel();
JButton r=new JButton("Red");
r.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
f.getContentPane().setBackground(Color.RED);
}
});
JButton g=new JButton("Green");
g.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
f.getContentPane().setBackground(Color.GREEN);
}
});
p.add(r);
p.add(g);
f.add(p);
f.setLocationRelativeTo(null);
f.setVisible(true);
}
public static void main(String[] args){
SwingUtilities.invokeLater(new Runnable(){
public void run(){
new ColorChange();
}
});
}
}