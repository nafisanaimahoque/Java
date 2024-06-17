import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class NumberIncrement{
private int number=0;
public NumberIncrement(){
JFrame f=new JFrame("My Frame");
f.setSize(300,100);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JPanel p=new JPanel();
JButton b=new JButton("ok");
JTextField t=new JTextField();
t.setEditable(false);
t.setText(Integer.toString(number));
b.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
		number++;
		t.setText(Integer.toString(number));
	}
});
p.add(b);
p.add(t);
f.add(p);
f.setLocationRelativeTo(null);
f.setVisible(true);
}
public static void main(String[] args){
	SwingUtilities.invokeLater(new Runnable(){
		public void run(){
			new NumberIncrement();
		}
	});
}
}