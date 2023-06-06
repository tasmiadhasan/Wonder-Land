import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class All_Movies {
    public void allmovies(){
            try{
                File file = new File("allmovies.txt");
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

        }
    }

