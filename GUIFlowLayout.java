import java.awt.*;    
import javax.swing.*;    
public class GUIFlowLayout 
{   
JFrame frameObj;     
GUIFlowLayout()  
{     
    frameObj = new JFrame();     
    JButton b1 = new JButton("1");    
    JButton b2 = new JButton("2");    
    JButton b3 = new JButton("3");    
    JButton b4 = new JButton("4");         
    frameObj.add(b1);
    frameObj.add(b2);
    frameObj.add(b3);
    frameObj.add(b4);        
    frameObj.setLayout(new FlowLayout());    
    frameObj.setSize(300, 300);    
    frameObj.setVisible(true);    
}     
public static void main(String argvs[])   
{    
    new GUIFlowLayout();    
}    
}    