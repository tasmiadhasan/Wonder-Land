import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UpComingFileInput {
    public void upcoming(){
        try{
            File file = new File("upcoming.txt");
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNext()) {
                String movieno=fileScanner.next();
                String name=fileScanner.next();
                String date=fileScanner.next();
                String time=fileScanner.next();
                Shows movies =new Shows(movieno,name,date,time);
                movies.show();
            }fileScanner.close();
        }catch (FileNotFoundException e){
            System.out.println("                                                     An error occurred: " + e.getMessage());
        }
        BookUp book=new BookUp();
        book.Book();
        System.out.println("                                                     ----------------------------------------------------");
        System.out.println("                                                     Press 1 to main menu");
        System.out.println("                                                     Press 2 to exit");
        System.out.println("                                                     ----------------------------------------------------");
        System.out.print("                                                     Enter your Choice:");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();

        if(choice==1){
            System.out.println();
            Main_Menu mainMenu=new Main_Menu();
            mainMenu.menu();
        }
        else if(choice==2){
            System.out.println();
            System.out.println("                                                     Thank you for using our service");
            System.exit(0);
        }
        else{
            System.out.println();
            System.out.println("                                                     Invalid Input");
        }

    }
}
