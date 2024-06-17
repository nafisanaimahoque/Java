import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Temperature{
private JFrame f;
private JTextField farenheit;
private JTextField celsius;
public Temperature(){
f=new JFrame("Farenheit to Celsius converter");
f.setSize(300,150);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JPanel p=new JPanel();
p.setLayout(new GridLayout(3,2));
JLabel fl=new JLabel("Enter farenheit temperature");
farenheit=new JTextField(10);
JLabel cl=new JLabel("Temperature in celsius");
celsius=new JTextField(10);
celsius.setEditable(false);
JButton b=new JButton("convert");
b.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
convert();
}
});
p.add(fl);
p.add(farenheit);
p.add(cl);
p.add(celsius);
p.add(new JLabel());
p.add(b);
f.add(p);
f.setLocationRelativeTo(null);
f.setVisible(true);
}
private void convert(){
double fa=Double.parseDouble(farenheit.getText());
double ce=(fa-32)*5/9;
celsius.setText(String.format("%f",ce));
}
public static void main(String[] args){
SwingUtilities.invokeLater(new Runnable(){
public void run(){
new Temperature();
}
});
}
}
