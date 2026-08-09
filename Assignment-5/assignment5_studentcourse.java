import java.util.ArrayList;

public class assignment5_studentcourse {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();

        courses.add("Programming With Java");
        courses.add("Discrete Mathematics");
        courses.add("Data Structures");
        courses.add("Operating Systems");

        courses.remove("Discrete Mathematics");

        StringBuffer sb = new StringBuffer();
        sb.append("Registered Courses:\n");
        for (int i = 0; i < courses.size(); i++) {
            sb.append(i + 1).append(". ").append(courses.get(i)).append("\n");
        }

        System.out.println(sb);
    }
}
