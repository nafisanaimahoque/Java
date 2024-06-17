import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUIElementsExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Radio/Combo Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel radioPanel = new JPanel();
        radioPanel.setBorder(BorderFactory.createTitledBorder("Radio Buttons"));
        JRadioButton radioButton1 = new JRadioButton("4 slices");
        JRadioButton radioButton2 = new JRadioButton("8 slices");
        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(radioButton1);
        radioButtonGroup.add(radioButton2);
        radioPanel.add(radioButton1);
        radioPanel.add(radioButton2);
        JPanel comboAndCheckPanel = new JPanel();
        comboAndCheckPanel.setBorder(BorderFactory.createTitledBorder("Combo Box and Check Boxes"));
        String[] comboItems = {"cow", "bird", "rabit","dog"};
        JComboBox<String> comboBox = new JComboBox<>(comboItems);
        JCheckBox checkBox1 = new JCheckBox("Anchovies");
        JCheckBox checkBox2 = new JCheckBox("Garlic");
        comboAndCheckPanel.add(comboBox);
        comboAndCheckPanel.add(checkBox1);
        comboAndCheckPanel.add(checkBox2);
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedValue = (String) comboBox.getSelectedItem();
                JOptionPane.showMessageDialog(frame, "Selected ComboBox item: " + selectedValue);
            }
        });
        frame.setLayout(new GridLayout(1,1));
        frame.add(radioPanel);
        frame.add(comboAndCheckPanel);
        frame.setVisible(true);
    }
}
