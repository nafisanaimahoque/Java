import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculatorGUI extends JFrame implements ActionListener {
    private JTextField textField1, textField2, resultField;
    private JButton addButton, subtractButton, multiplyButton, divideButton;

    public SimpleCalculatorGUI() {
        setTitle("Simple Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        JLabel label1 = new JLabel("Number 1:");
        JLabel label2 = new JLabel("Number 2:");
        JLabel label3 = new JLabel("Result:");

        textField1 = new JTextField();
        textField2 = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");

        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);

        add(label1);
        add(textField1);
        add(label2);
        add(textField2);
        add(label3);
        add(resultField);
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(textField1.getText());
        double num2 = Double.parseDouble(textField2.getText());
        double result = 0;

        if (e.getSource() == addButton) {
            result = num1 + num2;
        } else if (e.getSource() == subtractButton) {
            result = num1 - num2;
        } else if (e.getSource() == multiplyButton) {
            result = num1 * num2;
        } else if (e.getSource() == divideButton) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                JOptionPane.showMessageDialog(this, "Division by zero is not allowed.");
            }
        }

        resultField.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleCalculatorGUI calculator = new SimpleCalculatorGUI();
            calculator.setVisible(true);
        });
    }
}
