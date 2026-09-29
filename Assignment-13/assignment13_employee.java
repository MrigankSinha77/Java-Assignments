import java.io.FileWriter;
import java.io.FileReader;

public class assignment13_employee {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("employee.txt");

            fw.write("Employee Name: Rahul\n");
            fw.write("Employee ID: 101\n");
            fw.write("Salary: 35000");

            fw.close();

            FileReader fr = new FileReader("employee.txt");

            int ch;

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();
        }
        catch (Exception e) {
            System.out.println("File error");
        }
    }
}
