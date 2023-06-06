import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class login {
    public boolean signIn() {
        Scanner sc=new Scanner(System.in);
        System.out.print("                                                     Username: ");
        String user = sc.next();
        System.out.print("                                                     Password: ");
        String pass = sc.next();
        try {
            File file = new File("login.txt");
            Scanner fileScanner = new Scanner(file);
            boolean loginSuccessful = false;
            while (fileScanner.hasNext()) {
                String username = fileScanner.next();
                String password = fileScanner.next();
                if (user.equals(username) && pass.equals(password)) {
                    loginSuccessful = true;
                    break;
                }
            }
            fileScanner.close();
            if (loginSuccessful) {
                System.out.println("                                                     Welcome! You are now logged in!");
                System.out.println();
                Main_Menu main_menu=new Main_Menu();
                main_menu.menu();
                return true;
            } else {
                System.out.println("                                                     Login Failed");
                System.out.println("                                                     Please try again");
                System.out.println();
                signIn();

            }
        } catch (IOException e) {
            System.out.println("                                                     An error occurred: " + e.getMessage());
        }
        return false;
    }
}
