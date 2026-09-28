import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Simple Calculator");

        JLabel l1 = new JLabel("Enter First Number:");
        JLabel l2 = new JLabel("Enter Second Number:");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();

        JButton add = new JButton("Add");
        JButton sub = new JButton("Subtract");

        frame.setLayout(new GridLayout(4, 2, 10, 10));

        frame.add(l1);
        frame.add(t1);

        frame.add(l2);
        frame.add(t2);

        frame.add(add);
        frame.add(sub);

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());

                JOptionPane.showMessageDialog(frame, "Addition = " + (a + b));
            }
        });

        sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());

                JOptionPane.showMessageDialog(frame, "Subtraction = " + (a - b));
            }
        });

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
