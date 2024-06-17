import javax.swing.*;
public class FrameDemo{
public static void main(String[] args){
JFrame masterFrame=new JFrame("Master Frame");
masterFrame.setSize(300,200);
JFrame tempFrame=new JFrame("Temporary Frame");
tempFrame.setSize(300,200);
JButton openTempFrame=new JButton("open Temporary Frame");
openTempFrame.addActionListener(e-> tempFrame.setVisible(true));
masterFrame.add(openTempFrame);
masterFrame.setVisible(true);
}
}