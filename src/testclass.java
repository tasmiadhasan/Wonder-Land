import java.util.Scanner;

public class testclass {
    public static void main(String[] args) {
        WelScreen welcome= new WelScreen();
        login log=new login();
        SignUP sign=new SignUP();
        welcome.welcomeScreen();
        Scanner sc= new Scanner(System.in);
        System.out.println("                                                     1.Login");
        System.out.println("                                                     2.Signup");
        System.out.println("                                                     3.Exit");
        System.out.print("                                                     Enter your choice: ");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println();
                log.signIn();
                break;
            case 2:
                System.out.println();
                sign.signUp();
                break;
            case 3:
                System.out.println();
                System.out.println("                                                     Thank you for using Our website!");

                break;
            default:
                System.out.println("                                                     Invalid Input");
        }
    }
}
