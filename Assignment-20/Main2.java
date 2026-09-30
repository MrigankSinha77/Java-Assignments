import java.sql.*;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/java_db";
        String username = "root";
        String password = "MySQLServer7!";

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);
    
            // Create table
            String createTable = "CREATE TABLE IF NOT EXISTS student_crud (" +
                    "roll_no INT PRIMARY KEY, " +
                    "name VARCHAR(50), " +
                    "course VARCHAR(50), " +
                    "marks INT)";

            Statement stmt = con.createStatement();
            stmt.executeUpdate(createTable);

            int choice;

            do {
                System.out.println("\n--- Student Management ---");
                System.out.println("1. Insert Student");
                System.out.println("2. Display Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter Roll Number: ");
                        int rollNo = sc.nextInt();

                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Course: ");
                        String course = sc.nextLine();

                        System.out.print("Enter Marks: ");
                        int marks = sc.nextInt();

                        String insert = "INSERT INTO student_crud VALUES (?, ?, ?, ?)";

                        PreparedStatement ps1 = con.prepareStatement(insert);

                        ps1.setInt(1, rollNo);
                        ps1.setString(2, name);
                        ps1.setString(3, course);
                        ps1.setInt(4, marks);

                        ps1.executeUpdate();

                        System.out.println("Student inserted successfully.");
                        break;

                    case 2:
                        String select = "SELECT * FROM student_crud";

                        ResultSet rs = stmt.executeQuery(select);

                        System.out.println("\nStudent Records:");
                        System.out.println("--------------------------------");

                        while (rs.next()) {
                            System.out.println("Roll No: " + rs.getInt("roll_no"));
                            System.out.println("Name: " + rs.getString("name"));
                            System.out.println("Course: " + rs.getString("course"));
                            System.out.println("Marks: " + rs.getInt("marks"));
                            System.out.println("--------------------------------");
                        }
                        break;

                    case 3:
                        System.out.print("Enter Roll Number to update: ");
                        int updateRoll = sc.nextInt();

                        System.out.print("Enter new marks: ");
                        int newMarks = sc.nextInt();

                        String update = "UPDATE student_crud SET marks = ? WHERE roll_no = ?";

                        PreparedStatement ps2 = con.prepareStatement(update);

                        ps2.setInt(1, newMarks);
                        ps2.setInt(2, updateRoll);

                        ps2.executeUpdate();

                        System.out.println("Student updated successfully.");
                        break;

                    case 4:
                        System.out.print("Enter Roll Number to delete: ");
                        int deleteRoll = sc.nextInt();

                        String delete = "DELETE FROM student_crud WHERE roll_no = ?";

                        PreparedStatement ps3 = con.prepareStatement(delete);

                        ps3.setInt(1, deleteRoll);

                        ps3.executeUpdate();

                        System.out.println("Student deleted successfully.");
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } while (choice != 5);

            con.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
