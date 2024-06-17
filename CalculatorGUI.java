import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CalculatorGUI extends JFrame {
    private JTextField numField1, numField2, resultField;
    private JButton addButton, subtractButton, multiplyButton, divideButton;
    public CalculatorGUI() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));
        JLabel label1 = new JLabel("Number 1:");
        numField1 = new JTextField(10);
        JLabel label2 = new JLabel("Number 2:");
        numField2 = new JTextField(10);
        addButton = new JButton("Add");
        subtractButton = new JButton("Subtract");
        multiplyButton = new JButton("Multiply");
        divideButton = new JButton("Divide");
        resultField = new JTextField(20);
        resultField.setEditable(false);
        add(label1);
        add(numField1);
        add(label2);
        add(numField2);
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        add(resultField);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation('+');
            }
        });
        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation('-');
            }
        });
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation('*');
            }
        });
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation('/');
            }
        });
        pack();
        setLocationRelativeTo(null);
    }
    private void performOperation(char operation) {
        try {
            double num1 = Double.parseDouble(numField1.getText());
            double num2 = Double.parseDouble(numField2.getText());
            double result = 0;
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        resultField.setText("Division by zero");
                        return;
                    }
                    break;
            }

            resultField.setText("Result: " + result);
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input");
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculatorGUI().setVisible(true);
            }
        });
    }
}
