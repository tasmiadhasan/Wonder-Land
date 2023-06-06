import java.util.Scanner;

public class Main_Menu {
    public void menu(){
        Scanner sc=new Scanner(System.in);
        System.out.println("                                                     1.UpComing Show Lists");
        System.out.println("                                                     2.Available Shows");
        System.out.println("                                                     3.Book a Ticket For Upcoming & Available Shows");
        System.out.println("                                                     4.Exit");
        System.out.println();
        System.out.print("                                                     Enter your choice: ");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println();
                UpComingFileInput upcoming = new UpComingFileInput();
                upcoming.upcoming();
                break;
            case 2:
                System.out.println();
                AvailableMoviesFileInput available = new AvailableMoviesFileInput();
                available.available();
                break;
            case 3:
                System.out.println();
                Book book=new Book();
                book.book();
                break;
            case 4:
                System.out.println("                                                     Thank you for using Our website!");
                System.exit(0);
                break;
            default:
                System.out.println("                                                     Invalid Input");
        }

    }
}
