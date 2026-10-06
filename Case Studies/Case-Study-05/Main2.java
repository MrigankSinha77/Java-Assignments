import java.util.ArrayList;
import java.util.Vector;

class Course {
    String courseCode;
    String courseName;
    int credits;

    Course(String cCode, String cName, int creds) {
        courseCode = cCode;
        courseName = cName;
        credits = creds;
    }

    String getCourseCode() {
        return courseCode;
    }

    String getCourseName() {
        return courseName;
    }

    int getCredits() {
        return credits;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Vector<Course> courseList = new Vector<>();

        Course course1 = new Course("CS101", "Python Programming", 3);
        Course course2 = new Course("MATH201", "Discrete Mathematics", 4);
        Course course3 = new Course("CS102", "Operating Systems", 4);
        Course course4 = new Course("CS103", "Data Structures in C", 3);
        Course course5 = new Course("CS104", "Database Management Systems", 3);
        Course course6 = new Course("CS105", "Web Application Development", 3);

        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);
        courseList.add(course4);
        courseList.add(course5);
        courseList.add(course6);

        ArrayList<Course> selectedCourses = new ArrayList<>();

        // TC 1
        if (!selectedCourses.contains(course1)) {
            selectedCourses.add(course1);
        }
        if (!selectedCourses.contains(course3)) {
            selectedCourses.add(course3);
        }
        System.out.println("TC 1 Output: " + selectedCourses.size() + " registered courses");

        // TC 2
        if (selectedCourses.contains(course1)) {
            System.out.println("TC 2 Output: Duplicate registration rejected");
        } else {
            selectedCourses.add(course1);
        }

        // TC 3
        StringBuffer summary = new StringBuffer();
        summary.append("\n=== Course Registration Summary ===\n");

        int totalCredits = 0;
        for (Course c : selectedCourses) {
            summary.append("- ")
                    .append(c.getCourseCode())
                    .append(": ")
                    .append(c.getCourseName())
                    .append(" (")
                    .append(c.getCredits())
                    .append(" credits)\n");

            totalCredits += c.getCredits();
        }

        summary.append("-----------------------------------\n");
        summary.append("Total Registered Credits: ").append(totalCredits);

        System.out.println(summary.toString());
    }
}
