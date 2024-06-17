import java.awt.*;
import javax.swing.*;
public class GUIBorder
{
JFrame f;
GUIBorder()
{
    f = new JFrame();
    JButton b1 = new JButton("NORTH");;
    JButton b2 = new JButton("SOUTH");;
    JButton b3 = new JButton("EAST");;
    JButton b4 = new JButton("WEST");;
    f.add(b1, BorderLayout.NORTH);
    f.add(b2, BorderLayout.SOUTH);
    f.add(b3, BorderLayout.EAST);
    f.add(b4, BorderLayout.WEST);
    f.setSize(300, 300);
    f.setVisible(true);
}
public static void main(String[] args) {
    new GUIBorder();
}
}