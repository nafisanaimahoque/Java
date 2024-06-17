import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Investment extends JFrame{
private JTextField investment1;
private JTextField interest;
private JTextField year;
private JTextField futureValue;
private JButton calculate;
public Investment(){
setTitle("Investment calculator");
setSize(400,200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new GridLayout(5,2));
JLabel investment2=new JLabel("Investment amount");
investment1=new JTextField();
JLabel interest1=new JLabel("Interest rate");
interest=new JTextField();
JLabel future=new JLabel("Future value");
futureValue=new JTextField();
futureValue.setEditable(false);
calculate=new JButton("Calculate");
add(investment2);
add(investment1);
add(interest1);
add(interest);
add(future);
add(futureValue);
add(calculate);
calculate.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent e){
calculateValue();
}
});
}
private void calculateValue(){
try{
double investment3=Double.parseDouble(investment1.getText());
double interest2=Double.parseDouble(interest.getText())/100;
int years=Integer.parseInt(year.getText());
double monthlyinterest=interest2/12;
double future2=investment3*Math.pow(1+monthlyinterest,years*12);
futureValue.setText(String.format("%.2f",future2));
}
catch(NumberFormatException e){
		JOptionPane.showMessageDialog(this,"please enter valid number","input error",JOptionPane.ERROR_MESSAGE);
	}
}
public static void main(String args[]){
	SwingUtilities.invokeLater(new Runnable(){
		public void run(){
			new Investment().setVisible(true);
		}
	});
}
}