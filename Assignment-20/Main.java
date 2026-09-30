import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/java_db";
        String username = "root";
        String password = "MySQLServer7!";

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);

            // Create table
            String createTable = "CREATE TABLE IF NOT EXISTS employee (" +
                    "id INT PRIMARY KEY, " +
                    "name VARCHAR(50), " +
                    "department VARCHAR(50), " +
                    "salary DOUBLE)";

            Statement stmt = con.createStatement();
            stmt.executeUpdate(createTable);

            int choice;

            do {
                System.out.println("\n--- Employee Management ---");
                System.out.println("1. Insert Employee");
                System.out.println("2. Display Employees");
                System.out.println("3. Update Employee");
                System.out.println("4. Delete Employee");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter Employee ID: ");
                        int id = sc.nextInt();

                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Department: ");
                        String department = sc.nextLine();

                        System.out.print("Enter Salary: ");
                        double salary = sc.nextDouble();

                        String insert = "INSERT INTO employee VALUES (?, ?, ?, ?)";

                        PreparedStatement ps1 = con.prepareStatement(insert);

                        ps1.setInt(1, id);
                        ps1.setString(2, name);
                        ps1.setString(3, department);
                        ps1.setDouble(4, salary);

                        ps1.executeUpdate();

                        System.out.println("Employee inserted successfully.");
                        break;

                    case 2:
                        String select = "SELECT * FROM employee";

                        ResultSet rs = stmt.executeQuery(select);

                        System.out.println("\nEmployee Records:");
                        System.out.println("--------------------------------");

                        while (rs.next()) {
                            System.out.println("ID: " + rs.getInt("id"));
                            System.out.println("Name: " + rs.getString("name"));
                            System.out.println("Department: " + rs.getString("department"));
                            System.out.println("Salary: " + rs.getDouble("salary"));
                            System.out.println("--------------------------------");
                        }
                        break;

                    case 3:
                        System.out.print("Enter Employee ID to update: ");
                        int updateId = sc.nextInt();

                        System.out.print("Enter new salary: ");
                        double newSalary = sc.nextDouble();

                        String update = "UPDATE employee SET salary = ? WHERE id = ?";

                        PreparedStatement ps2 = con.prepareStatement(update);

                        ps2.setDouble(1, newSalary);
                        ps2.setInt(2, updateId);

                        ps2.executeUpdate();

                        System.out.println("Employee updated successfully.");
                        break;

                    case 4:
                        System.out.print("Enter Employee ID to delete: ");
                        int deleteId = sc.nextInt();

                        String delete = "DELETE FROM employee WHERE id = ?";

                        PreparedStatement ps3 = con.prepareStatement(delete);

                        ps3.setInt(1, deleteId);

                        ps3.executeUpdate();

                        System.out.println("Employee deleted successfully.");
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
