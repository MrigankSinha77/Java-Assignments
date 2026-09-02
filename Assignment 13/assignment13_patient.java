import java.io.FileWriter;
import java.io.FileReader;

public class assignment13_patient {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("patient.txt");

            fw.write("Patient ID: 101\n");
            fw.write("Name: Rahul\n");
            fw.write("Age: 25\n");
            fw.write("Diagnosis: Fever");

            fw.close();

            FileReader fr = new FileReader("patient.txt");

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
