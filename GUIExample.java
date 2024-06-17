import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUIExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Radio/Combo Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(2,1));
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(2,1));
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(2,1));
        JRadioButton radio1 = new JRadioButton("4 slices");
        JRadioButton radio2 = new JRadioButton("8 slices");
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radio1);
        radioGroup.add(radio2);
        String[] comboItems = {"Bird", "Cat", "Dog", "Rabbit","Cow"};
        JComboBox<String> comboBox = new JComboBox<>(comboItems);
        JCheckBox check1 = new JCheckBox("Anchovies");
        JCheckBox check2 = new JCheckBox("Garlic");
        panel1.add(radio1);
        panel1.add(radio2);
        panel2.add(comboBox);
        panel2.add(check1);
        panel2.add(check2);
        frame.add(panel1);
        frame.add(panel2);
        frame.setVisible(true);
    }
}

