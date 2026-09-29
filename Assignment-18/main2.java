import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BankBalance {
    public static void main2(String[] args) {

        JFrame frame = new JFrame("Bank Balance Calculator");

        JLabel l1 = new JLabel("Initial Balance:");
        JLabel l2 = new JLabel("Transaction Amount:");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();

        JButton deposit = new JButton("Deposit");
        JButton withdraw = new JButton("Withdraw");

        frame.setLayout(new GridLayout(4, 2, 10, 10));

        frame.add(l1);
        frame.add(t1);

        frame.add(l2);
        frame.add(t2);

        frame.add(deposit);
        frame.add(withdraw);

        deposit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double balance = Double.parseDouble(t1.getText());
                double amount = Double.parseDouble(t2.getText());

                balance = balance + amount;

                JOptionPane.showMessageDialog(
                        frame,
                        "Updated Balance = " + balance
                );
            }
        });

        withdraw.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double balance = Double.parseDouble(t1.getText());
                double amount = Double.parseDouble(t2.getText());

                balance = balance - amount;

                JOptionPane.showMessageDialog(
                        frame,
                        "Updated Balance = " + balance
                );
            }
        });

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
