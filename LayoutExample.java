import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LayoutExample {
    public static void main(String[] args) {
        JFrame frameJFrame = new JFrame("My Frame");
        JPanel panelFlowLayout = new JPanel();
        panelFlowLayout.add(new JLabel("Label"));
        panelFlowLayout.add(new JTextField("Text                       "));
        panelFlowLayout.add(new JButton("Send"));
        frameJFrame.add(panelFlowLayout);
         frameJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frameJFrame.setSize(400, 200);
        frameJFrame.setVisible(true);
        frameJFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}
