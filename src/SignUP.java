
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class SignUP{
    public void signUp() {
        Scanner sc=new Scanner(System.in);
        System.out.print("                                                     Enter Username: ");
        String user = sc.next();
        System.out.print("                                                     Enter Password: ");
        String pass = sc.next();
        try {
            File file = new File("login.txt");
            FileWriter fw = new FileWriter(file, true);
            fw.write(user + " " + pass + "\n");
            fw.close();
            System.out.println("                                                     Sign Up Successful");
            System.out.println();
            System.out.println("                                                     Now you can login");
            login login = new login();
            login.signIn();
        } catch (IOException e) {
            System.out.println("                                                     An error occurred: " + e.getMessage());
        }
    }
}
