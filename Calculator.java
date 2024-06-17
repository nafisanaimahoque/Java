import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculator extends JFrame implements ActionListener{
private JTextField t1,t2,r;
private JButton addi,sub,mul,div;
public Calculator(){
setTitle("Simple calculator");
setSize(400,200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
setLayout(new GridLayout(5,2));
JLabel l1=new JLabel("first integer:");
JLabel l2=new JLabel("second integer");
JLabel l3=new JLabel("result");
t1=new JTextField();
t2=new JTextField();
r=new JTextField();
r.setEditable(false);
addi=new JButton("+");
sub=new JButton("-");
mul=new JButton("*");
div=new JButton("/");
addi.addActionListener(this);
sub.addActionListener(this);
mul.addActionListener(this);
div.addActionListener(this);
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(r);
add(addi);
add(sub);
add(mul);
add(div);
}

@Override
public void actionPerformed(ActionEvent e){
double n1=Double.parseDouble(t1.getText());
double n2=Double.parseDouble(t2.getText());
double r1=0;
if(e.getSource()==addi){
r1=n1+n2;
}
else if(e.getSource()==sub){
r1=n1-n2;
}
else if(e.getSource()==mul){
r1=n1*n2;
}
else if(e.getSource()==div){
if(n2!=0){
r1=n1/n2;
}
else{
JOptionPane.showMessageDialog(this,"division by zero is not possible");
}
}
r.setText(String.valueOf(r1));
}
public static void main(String[] args){
SwingUtilities.invokeLater(()->{
Calculator c=new Calculator();
});
}
}