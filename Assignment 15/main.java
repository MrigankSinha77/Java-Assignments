import java.util.Scanner;

class LoginProgram {

    static void login(String password) throws Exception {
        String correctPassword = "java123";

        if (!password.equals(correctPassword)) {
            throw new Exception("Invalid Password");
        }

        System.out.println("Login Successful");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        try {
            login(password);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Login process completed.");
        }

        sc.close();
    }
}
