import java.util.ArrayList;

public class assignment5_todolist {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Buy groceries");
        tasks.add("Finish assignment");
        tasks.add("Clean room");
        tasks.add("Read book");

        tasks.remove("Clean room");

        StringBuffer sb = new StringBuffer();
        sb.append("To-Do List:\n");
        for (int i = 0; i < tasks.size(); i++) {
            sb.append(i + 1).append(". ").append(tasks.get(i)).append("\n");
        }

        System.out.println(sb);
    }
}
