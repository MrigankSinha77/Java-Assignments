import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class StudentRegistration {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Registration Form");

        JLabel nameLabel = new JLabel("Name:");
        JLabel rollLabel = new JLabel("Roll No:");
        JLabel courseLabel = new JLabel("Course:");
        JLabel genderLabel = new JLabel("Gender:");

        JTextField nameField = new JTextField();
        JTextField rollField = new JTextField();

        String courses[] = {"CSE", "IT", "ENTC", "Mechanical"};
        JComboBox<String> courseBox = new JComboBox<>(courses);

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JButton registerButton = new JButton("Register");

        frame.setLayout(new GridLayout(5, 2, 10, 10));

        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(rollLabel);
        frame.add(rollField);

        frame.add(courseLabel);
        frame.add(courseBox);

        frame.add(genderLabel);

        JPanel genderPanel = new JPanel();
        genderPanel.add(male);
        genderPanel.add(female);
        frame.add(genderPanel);

        frame.add(new JLabel(""));
        frame.add(registerButton);

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String gender = "";

                if (male.isSelected()) {
                    gender = "Male";
                } else if (female.isSelected()) {
                    gender = "Female";
                }

                JOptionPane.showMessageDialog(
                        frame,
                        "Student Registered Successfully!\n\n" +
                                "Name: " + nameField.getText() +
                                "\nRoll No: " + rollField.getText() +
                                "\nCourse: " + courseBox.getSelectedItem() +
                                "\nGender: " + gender
                );
            }
        });

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
