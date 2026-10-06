import java.util.Scanner;

class StudentResult {
    private static final int PASS_MARK = 40;   // minimum marks needed in EACH subject

    private String name;
    private int rollNo;
    private int m1, m2, m3;

    public StudentResult(String name, int rollNo, int m1, int m2, int m3) {
        this.name = name;
        this.rollNo = rollNo;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    // Input-independent calculation: works purely on the values passed in
    public int calculateTotal(int a, int b, int c) {
        return a + b + c;
    }

    public double calculateAverage(int total) {
        return total / 3.0;
    }

    // Pass only if every subject is at least PASS_MARK
    public String determineResult(int a, int b, int c) {
        if (a >= PASS_MARK && b >= PASS_MARK && c >= PASS_MARK) {
            return "Pass";
        }
        return "Fail";
    }

    // Formatted display
    public void display() {
        int total = calculateTotal(m1, m2, m3);
        double average = calculateAverage(total);
        String result = determineResult(m1, m2, m3);

        System.out.println("--------------------------------");
        System.out.println("Name     : " + name);
        System.out.println("Roll No  : " + rollNo);
        System.out.println("Marks    : " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Total    : " + total);
        System.out.printf("Average  : %.2f%n", average);
        System.out.println("Result   : " + result);
        System.out.println("--------------------------------");
    }
}

// ---------- Driver ----------
public class Main {

    private static boolean validMarks(int m) {
        return m >= 0 && m <= 100;
    }

    public static void main(String[] args) {
        // Built-in test cases from the case study
        System.out.println("TC1: normal marks (80, 70, 90) -> expect Total 240, Average 80");
        new StudentResult("Test One", 1, 80, 70, 90).display();

        System.out.println("TC2: failing marks (40, 40, 39) -> expect Fail");
        new StudentResult("Test Two", 2, 40, 40, 39).display();

        System.out.println("TC3: boundary marks (0, 0, 0) -> expect Average 0");
        new StudentResult("Test Three", 3, 0, 0, 0).display();

        // Command-line input
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter details for a new student:");

        System.out.print("Name        : ");
        String name = sc.nextLine();

        System.out.print("Roll number : ");
        int roll = sc.nextInt();

        int[] marks = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Marks in subject " + (i + 1) + " (0-100): ");
            marks[i] = sc.nextInt();
            if (!validMarks(marks[i])) {
                System.out.println("Invalid marks. Please enter a value between 0 and 100.");
                sc.close();
                return;
            }
        }

        new StudentResult(name, roll, marks[0], marks[1], marks[2]).display();
        sc.close();
    }
}
