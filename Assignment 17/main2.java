import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class EmployeeRegistration {
    public static void main2(String[] args) {

        JFrame frame = new JFrame("Employee Registration Form");

        JLabel idLabel = new JLabel("Employee ID:");
        JLabel nameLabel = new JLabel("Name:");
        JLabel deptLabel = new JLabel("Department:");
        JLabel salaryLabel = new JLabel("Salary:");

        JTextField idField = new JTextField();
        JTextField nameField = new JTextField();
        JTextField deptField = new JTextField();
        JTextField salaryField = new JTextField();

        JButton submitButton = new JButton("Submit");

        frame.setLayout(new GridLayout(5, 2, 10, 10));

        frame.add(idLabel);
        frame.add(idField);

        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(deptLabel);
        frame.add(deptField);

        frame.add(salaryLabel);
        frame.add(salaryField);

        frame.add(new JLabel(""));
        frame.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(
                        frame,
                        "Employee Details\n\n" +
                                "Employee ID: " + idField.getText() +
                                "\nName: " + nameField.getText() +
                                "\nDepartment: " + deptField.getText() +
                                "\nSalary: " + salaryField.getText()
                );
            }
        });

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
